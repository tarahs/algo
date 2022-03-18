package com.interview.algorithms.search;

import java.util.Arrays;

/**
 * The basic idea behind Binary search is to
 * 
 * 1. Use the Sorted array which would help the search algorithm to be very efficient
 * 
 * 2. Compare the element to be searched with middle element of an array. if the element is matching
 * then return the postion.
 * 
 * 3. If not if the key is greater than the middle element then search will be performed on the
 * right portion of the array given the input array is in asc order.
 * 
 * 4. step 2 will be performed on the right portion of the array.
 * 
 * 5. These steps will be continued until the element is found or the subarray size becomes 1;
 * 
 * TIME COMPLEXITY : O(log n) ---> n/2 + n/4 + n/8......1 ---> n/2^k = 1 ---> k(steps) = log(n)
 * 
 * SPACE COMPLEXITY: Iterative : O(1) Recursive: O(n) If the input array is an input parameter to
 * recursive function.
 * 
 * @author tara
 *
 */

public class BinarySearch {

    static int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };

    public static int binarySearch( int key )
    {

        if( array == null || array.length == 0 )
            return -1;
        Arrays.sort(array);
        int size = array.length;
        int low = 0;
        int high = size - 1;
        int mid = 0;

        while( high >= low )
        {
            mid = low + (high - low) / 2;

            if( array[mid] == key )
                return mid;

            if( array[mid] > key )
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static int recursiveBinarySearch( int key, int low, int high )
    {
        if( high >= low )
        {
            int mid = low + (high - low) / 2;
            if( array[mid] == key )
                return mid;

            if( array[mid] > key )
                return recursiveBinarySearch(key, low, mid - 1);
            else
                return recursiveBinarySearch(key, mid + 1, high);
        }
        return -1;
    }

    public static void main( String[] args )
    {
        System.out.println(binarySearch(7));
        System.out.println(recursiveBinarySearch(7, 0, array.length));
    }
}

