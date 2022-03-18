package com.interview.algorithms.sort;

/**
 * Like Merge Sort Quick sort also works on the divide and conquer technique.
 * 
 * The key process in quicksort is partition. The target of partition is, given an array with the
 * element x of an array as a pivot, place x at its correct position in sorted array and place all
 * the smaller elements before x and all the larger elements after x.
 * 
 * SPACE COMPLEXITY BEST and Average = O(logn) and WORST = O(nlogn)
 * 
 * TIME COMLEXITY BEST and Average = O(n log n) Worst = O(n^2) --> T(0)+T(n-1)+O(n) --> O(n^2)
 *
 * 4,3,5,8,1,7
 *
 * 4,3,5,1,8,7
 * i = 3
 * j = 5
 *
 */


public class QuickSort {

    /**
     * A function to Partition an array. This is going to identify pivot element, place in correct
     * positon of sorted list. Places all elements less than pivot before pivot's position all
     * elements great after pivots position
     */
    public static int partition2( int[] array, int low, int high )
    {

        int i = (low - 1);
        int j = low;
        int pivot = array[high];

        while( j < high )
        {
            if( array[j] <= pivot )
            {
                i = i + 1;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            j = j + 1;
        }

        array[high] = array[i + 1];
        array[i + 1] = pivot;

        System.out.println("PIVOT "+pivot+", POSITION "+i+1);
        for(int k = 0; k<array.length; k++){
            System.out.print(array[k]+",");
        }
        System.out.println("");

        return i + 1;

    }

    public static int partition(int[] array, int low, int high){

        int mid = low+(high-low)/2;
        int pivot = array[mid];

        int i = low;
        int j = high;

        //5 4 3 2 1
        while(i<j){
            while(array[i] < pivot)
                i++;

            while(array[j] > pivot)
                j--;

            if(i < j){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        System.out.println("PIVOT "+pivot+", POSITION "+i);
        for(int k = 0; k<array.length; k++){
            System.out.print(array[k]+",");
        }
        System.out.println("");
        return i;
    }

    public static int partition3(int[] array, int low, int high){

        int pivot = array[low];

        int i = low+1;
        int j = high;

        //5 4 3 2 1
        while(i<j){
            while(array[i] < pivot)
                i++;

            while(array[j] > pivot)
                j--;

            if(i < j){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        array[low] = array[j];
        array[j] = pivot;


        System.out.println("PIVOT "+pivot+", POSITION "+i);
        for(int k = 0; k<array.length; k++){
            System.out.print(array[k]+",");
        }
        System.out.println("");
        return j;
    }

    /**
     * The function that implements quicksort
     */
    public static void quickSort( int[] array, int low, int high )
    {
        if( low < high )
        {
            //pi is the partitioning index. array[pi] is now at its right position
            int pi = partition3(array, low, high);

            //Recursively sort the elements before pivot
            //and after pivot 
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);

        }
    }

    public static void print( int[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.print(array[i]+", ");
        }
        System.out.println(" ");
    }

    public static void main( String[] args )
    {

        int[] array = new int[] { 11, 28, 31, 24, 50, 66, 37 };
        System.out.println("Before Sorting........");
        print(array);
        quickSort(array, 0, 6);
        System.out.println("\nAfter Sorting........");
        print(array);
    }
    /**
     * 11, 28, 31, 24, 50, 66, 37
     *
     * 11, 24  31    28
     *
     * 11, 24, 31, 28, 37, 50, 66
     */

}
