package com.interview.algorithms;

import java.util.Arrays;

public class Search {

    static int[] array = new int[] { 31, 14, 19, 26, 27, 10, 33, 35, 42, 44 };

    public static void main( String[] args )
    {

        linearSearch(0);
        binarySearch(10);
        interpolationSearch(14);

    }

    static void linearSearch( int searchKey )
    {
        int index;
        int size = array.length;
        for( index = 0; index < size; index++ )
        {
            if( array[index] == searchKey )
            {
                System.out.println("Linear Search key " + searchKey + " found in the position " + (index + 1));
                break;
            }

        }
        if( index == size )
            System.out.println("Seacch key not found in the list");
    }

    /**
     * Binary search search a particular item by comparing the middle most item of the collection.
     * If match occurs then index of item is returned. If middle item is greater than item then item
     * is searched in sub-array to the right of the middle item other wise item is search in
     * sub-array to the left of the middle item. This process continues on sub-array as well until
     * the size of subarray reduces to zero. mid = low+(high - low)/2
     */
    static void binarySearch( int searchKey )
    {
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        int iter = 1;

        while( high >= low )
        {
            //get Mid of the array
            mid = low + (high - low) / 2;

            System.out.println("Iteration " + (iter++) + " low is " + low + " high is " + high + " mid is " + mid);

            if( array[mid] == searchKey )
            {
                System.out.println("Binary Search key " + searchKey + " found in the position " + (mid + 1));
                break;
            }

            if( searchKey > array[mid] )
                low = mid + 1;

            if( searchKey < array[mid] )
                high = mid - 1;

        }

    }

    /**
     * Mid = Low + ((High - Low)/A[high]-A[low])*(searkey - A[high])
     */
    static void interpolationSearch( int searchKey )
    {
        Arrays.sort(array);
        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        int iter = 1;

        while( high >= low )
        {

            //get Mid of the array
            mid = low + ((high - low) / (array[high] - array[low])) * (searchKey * array[low]);

            System.out.println("Iteration " + (iter++) + " low is " + low + " high is " + high + " mid is " + mid);

            if( array[mid] == searchKey )
            {
                System.out.println("interpolation Search key " + searchKey + " found in the position " + (mid + 1));
                break;
            }

            if( searchKey > array[mid] )
                low = mid + 1;

            if( searchKey < array[mid] )
                high = mid - 1;

        }

    }
}
