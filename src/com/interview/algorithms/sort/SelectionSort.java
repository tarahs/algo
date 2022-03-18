package com.interview.algorithms.sort;

/**
 * 1. The basic idea behind selection sort is to divide the input array into 2 portions.
 * 
 * 2. One is unsorted and another one is sorted.
 * 
 * 3. At each step of an algorithm a number is moved from unsorted portion to sorted portion
 * 
 * 4. Until eventually the entire list is sorted.
 * 
 * TIME COMPLEXITY -- O(n^2)
 * 
 * 1. Algo finds the mininum unsorted element and put it at the end of sorted portion by considering
 * and remembering first element of the unsorted portion as min and and comparing each element to
 * the remembered min element. after the min element is found, min elemented will be placed at the
 * end of sorted portion.
 * 
 */
public class SelectionSort {

    static int[] array = new int[] { 11, 28, 31, 24, 50, 66, 37 };

    public static int[] selectionSort()
    {

        if( array == null || array.length <= 1 )
            return array;

        int size = array.length;

        for( int i = 0; i < (size - 1); i++ )
        {
            int min = i;

            for( int j = (i + 1); j < size; j++ )
            {

                if( array[min] > array[j] )
                {
                    min = j;
                }
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;

    }

    public static void print()
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println(array[i]);
        }
    }

    public static void main( String[] args )
    {
        System.out.println(selectionSort());
        print();
    }

}
