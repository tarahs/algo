package com.interview.algorithms.sort;

/**
 * * This is an in-place comparison-based sorting algorithm. Here, a sub-list is maintained which is always sorted.
 * For example, the lower part of an array is maintained to be sorted. An element which is to be 'insert'ed in this sorted sub-list,
 * has to find its appropriate place and then it has to be inserted there. Hence the name, insertion sort.
 * 
 * pick the first element and find its position in the sorted array. Pick the second element and
 * find its position in the sorted array and place it...repeat the same step until all the elements
 * of array are sorted.
 * 
 * 
 * TIME COMPLEXITY : O(n^2)
 * 
 * @author tara
 *
 */

public class InsertionSort {

    public static int[] insertionSort( int array[] )
    {
        if( array == null || array.length <= 1 )
            return array;

        for( int i = 1; i < (array.length); i++ )
        {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of
             * their current position */
            while( j >= 0 && array[j] > key )
            {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
        return array;
    }

}
