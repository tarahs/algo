package com.interview.algorithms.search;

/**
 * Linear search is a simplest seraching algorithm.
 * 
 * 1. Compare each element in a list with the search key sequentially until the serach element is
 * found or the algorithm reaches end of an array
 * 
 * 2. return the index if any match found.
 * 
 * 3. Otherwise return -1 -- deafult value to indicate that the serach is not found.
 * 
 * TIME COMPLEXITY: O(n)
 * 
 * SPACE COMPLEXITY: O(1)
 * 
 * @author tara
 *
 */
public class LinearSearch {

    static int[] array = { 1, 2, 4, 4, 5, 6, 7 };

    public static int linearSearch( int key )
    {
        if( array == null || array.length == 0 )
            return -1;

        int size = array.length;

        for( int i = 0; i < size; i++ )
        {
            if( key == array[i] )
            {
                System.out.println("Key found at " + (i + 1) + " position");
                return i + 1;
            }
        }

        return -1;
    }

    public static void main( String[] args )
    {
        System.out.println(linearSearch(4));
    }

}
