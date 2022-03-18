package com.interview.algorithms.sort;

/**
 * Bubble sort is a simple sorting algorithm in which each pair of adjacent elements is compared and
 * elements are swapped if they are not inorder. This algorithm is not suitable for large data sets
 * as its average and worst case complexity are of O(n2) where n are no. of items. BEST CASE: O(n)
 * 
 * TIME COMPLEXITY : O(n^2) --> WORST AND AVG O(n) --> BEST CASE
 * 
 * SPACE COMPLEXITY: O(1)
 * 
 * @author tara
 *
 */
public class BubbleSort {

    public static int[] bubbleSort( int[] array )
    {

        if( array == null || array.length <= 1 )
            return array;

        Boolean isSwap = false;
        for( int i = 0; i < (array.length - 1); i++ )
        {

            for( int j = 0; j < (array.length - i - 1); j++ )
            {

                if( array[j] > array[j + 1] )
                {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwap = true;
                }

            }
            if( !isSwap )
                break;

            isSwap = false;
        }

        return array;
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
        bubbleSort(array);
        System.out.println("\nAfter Sorting........");
        print(array);
    }
}
