package com.interview.algorithms.sort;

/**
 * Merge Sort works on the divide and conquer technique
 * 
 * It divids the array into 2 halves iteratively unless the atomic value is reached and calls itself for the 2 halfs and then merge the 2 sorted
 * halves
 * Divide Step : if given arry has 0 or 1 elements, then the array is already sorted. Return the same
 * array. Else Split array into 2 subarrays each containing about half of the elements of an array.
 * 
 * Conquer: Conquer recursively by sorting the 2 subarrays.
 * 
 * Combine: Combine the elements back in array by merging two sorted subarrays into a sorted
 * sequence.
 * 
 * 
 * TIME COMPLEXITY best, avg and worst-- O(n log n) T(n) = T(n/2)+T(n/2)+O(n) = O(n log n) SPACE
 * COMPLEXITY = O(n)
 * 
 * @author tara
 *
 */
public class MergeSort {

    public static void mergeSort( int[] array, int l, int r )
    {
        if( l < r )
        {
            //Find middle point
            int mid = (l + r) / 2;

            //Sort first and second halves
            mergeSort(array, l, mid);

            mergeSort(array, mid + 1, r);

            //Merge the sorted halves
            merge(array, l, mid, r);

        }
    }

    /**
     * Merge 2 subarrays of arr[]
     * 
     * @param array
     * @param l
     * @param m
     * @param r
     */
    public static void merge( int[] array, int l, int m, int r )
    {
        //Find sizes of Sub arrays to be merged
        int lArraySize = m - l + 1;
        int rArraySize = r - m;

        //Create temp Arrays
        int lArray[] = new int[lArraySize];
        int rArray[] = new int[rArraySize];

        //Copy data to Temp Array
        for( int i = 0; i < lArraySize; i++ )
        {
            lArray[i] = array[l + i];
        }

        for( int i = 0; i < rArraySize; i++ )
        {
            rArray[i] = array[(m + 1) + i];
        }

        //Initial indexes of first and sec subarrays
        int lArrayPointer = 0, rArrayPointer = 0;

        //Initial index of merged subarray
        int k = l;

        while( lArrayPointer < lArraySize && rArrayPointer < rArraySize )
        {
            if( lArray[lArrayPointer] <= rArray[rArrayPointer] )
                array[k++] = lArray[lArrayPointer++];
            else
                array[k++] = rArray[rArrayPointer++];
        }

        //Copy remaining elelements of left array
        while( lArrayPointer < lArraySize )
        {
            array[k++] = lArray[lArrayPointer++];
        }

        //Copy remaining elements of right array
        while( rArrayPointer < rArraySize )
        {
            array[k++] = rArray[rArrayPointer++];
        }

    }

    public static void print( int[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println(array[i]);
        }
    }

    public static void main( String[] args )
    {

        int[] array = new int[] { 11, 28, 31, 24, 50, 66, 37 };
        System.out.println("Before Sorting........");
        print(array);
        mergeSort(array, 0, 8);
        System.out.println("\nAfter Sorting........");
        print(array);
    }

}
