package com.interview.algorithms;

public class Sort {

	//static int[] array = new int[] { 54, 05, 12, 04, 53, 11 };
	static int[] array = new int[] { 35, 33, 42, 10, 14, 19, 27, 44, 26, 31 };
	static int[] finalArray = array;

	public static void main( String[] args )
	{

		//		bubbleSortAsc();
		//		bubbleSortDesc();
		//		insertSort();
		//		selectionSort();
		//		mergeSort(0, (array.length - 1));
		//		System.out.println("Merge Sorted Array is ");
		//		printArray(finalArray);
		//
		quickSort(0, array.length - 1);
		System.out.println("\n Quick Sorted Array is ");
		printArray(null);
	}

	/**
	 * Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison based
	 * algorithm in which each pair of adjacent elements is compared and elements are swapped if
	 * they are not in order. This algorithm is not suitable for large data sets as its average and
	 * worst case complexity are of O(n2) where n are no. of items.
	 */
	static void bubbleSortAsc()
	{

		//Iterate trough the list n number if times
		for( int i = 0; i < (array.length - 1); i++ )
		{
			Boolean isSwap = false;
			//One element will be placed in correct position on each ieteration 
			for( int j = 0; j < (array.length - 1); j++ )
			{
				if( array[j] > array[j + 1] )
				{
					int currentElement = array[j];
					array[j] = array[j + 1];
					array[j + 1] = currentElement;
					isSwap = true;
				}
			}

			if( !isSwap )
				break;

		}
		System.out.println("\nBubble Sorted list in incremental Order is");
		printArray(null);
	}

	static void bubbleSortDesc()
	{

		for( int i = 0; i < (array.length - 1); i++ )
		{
			Boolean isSwap = false;

			for( int j = 0; j < (array.length - 1); j++ )
			{
				if( array[j] < array[j + 1] )
				{
					int currentElement = array[j];
					array[j] = array[j + 1];
					array[j + 1] = currentElement;
					isSwap = true;
				}
			}

			if( !isSwap )
				break;

		}
		System.out.println("\nBubble Sorted list in decremental order is");
		printArray(null);
	}

	/**
	 * The array is searched sequentially and unsorted items are moved and inserted into sorted
	 * sub-list (in the same array). This algorithm is not suitable for large data sets as its
	 * average and worst case complexity are of Ο(n2) where n are no. of items.
	 */
	static void insertSort()
	{

		int insertPosition;
		int elementTobeInserted;

		//Iterate through the loop n number of times and in iterate find the correct position of element
		for( int i = 1; i < array.length; i++ )
		{
			insertPosition = i;
			elementTobeInserted = array[i];

			//Find out the position in which the element to be inserted where insert position to be greater than 0 
			//always if insertPosition element less than insertpostion but one element
			while( insertPosition > 0 && array[insertPosition - 1] > elementTobeInserted )
			{
				array[insertPosition] = array[insertPosition - 1];
				insertPosition = insertPosition - 1;
			}

			array[insertPosition] = elementTobeInserted;
		}
		System.out.println(" Insert Sorted list in incremental Order is");
		printArray(null);
	}

	/**
	 * The array is searched sequentially and unsorted items are moved and inserted into sorted
	 * sub-list (in the same array). This algorithm is not suitable for large data sets as its
	 * average and worst case complexity are of Ο(n2) where n are no. of items. 14,33,27,10,35,19
	 */
	static void selectionSort()
	{
		//Iterate through the loop to find out the proper position for each element
		for( int i = 0; i < array.length; i++ )
		{
			int currentElement = array[i];
			int leastElement = array[i];
			int leastElementIndex = i;
			for( int j = i + 1; j < array.length; j++ )
			{
				if( array[j] < leastElement )
				{
					leastElement = array[j];
					leastElementIndex = j;
				}
			}
			array[leastElementIndex] = currentElement;
			array[i] = leastElement;

		}
		System.out.println(" Selection Sorted list in incremental Order is");
		printArray(null);

	}

	/**
	 * Merge sort is a sorting technique based on divide and conquer technique. It first divides the
	 * array and sub arrays into equal halves until the atomic values are found and then combines
	 * them in a sorted manner. With worst-case time complexity being Ο(n log n), it is one of the
	 * most respected algorithms.
	 */
	public static void mergeSort( int low, int high )
	{
		//Check if low is less than high, otherwise it means that array is already sorted
		if( low < high )
		{

			//find the mid index
			int mid = low + (high - low) / 2;

			//Sort the left part of an Array
			mergeSort(low, mid);

			//Sort Right Part of an Array
			mergeSort(mid + 1, high);

			//Merge the Sorted Arrays
			merge(low, mid, high);
		}
	}

	public static void merge( int low, int mid, int high )
	{
		System.out.println("low is " + low + " high is " + high + " mid is " + mid);
		//Temparary Array to store the Array Values. hence not disturbing the values derived by diving the array
		int[] tempArray = new int[high + 1];

		for( int i = low; i <= high; i++ )
		{
			tempArray[i] = array[i];
		}

		int i = low;
		int j = mid + 1;
		int k = low;

		//Copy the values from either the left or right Array to the final Array having smallest element in the lower hand of the array
		while( i <= mid && j <= high )
		{
			if( tempArray[i] > tempArray[j] )
			{
				finalArray[k] = tempArray[j];
				j++;
			}
			else
			{
				finalArray[k] = tempArray[i];
				i++;
			}
			k++;

		}

		//Copy the remaining remaning items of left array to the final list
		while( i <= mid )
		{
			finalArray[k] = tempArray[i];
			k++;
			i++;
		}

		while( j <= high )
		{
			finalArray[k] = tempArray[j];
			j++;
			k++;
		}
	}

	//54 05 12 04 53 11
	/**
	 * 
	 * Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of
	 * data into smaller arrays. A large array is partitioned into two arrays one of which holds
	 * values smaller than specified value say pivot based on which the partition is made and
	 * another array holds values greater than pivot value.
	 * 
	 * The quick sort partitions an array and then calls itself recursively twice to sort the
	 * resulting two subarray. This algorithm is quite efficient for large sized data sets as its
	 * average and worst case complexity are of O(nlogn) where n are no. of items.
	 */
	public static void quickSort( int low, int high )
	{

		if( high == 0 )
			return;

		//low >= high, then it means that elements are already sorted
		//		if( low >= high )
		//			return;

		//Take the middle element as a Pivot
		int pivot = array[low + (high - low) / 2];
		int i = low;
		int j = high;

		//If i<= j, then it means that elements are unsorted
		while( i <= j )
		{
			//Increase the lower pointer until the element which is greater than pivot is found
			while( array[i] < pivot )
				i++;

			//Decrease the high pointer until the element which is lower than pivot is Found
			while( array[j] > pivot )
				j--;

			//Swap the elements if i is not greater then J and increase i pointer and decrease j pointer
			if( i <= j )
			{
				swap(i, j);
				i++;
				j--;
			}

		}
		printArray(null);

		//Sort the Array which contains smaller items than the pivot value
		if( j > low )
			quickSort(low, j);

		//Sort the Array which contains greater items than the Pivot Value
		if( i < high )
			quickSort(i, high);

	}

	private static void swap( int position1, int position2 )
	{
		int temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	}

	static void printArray( int[] inputarray )
	{
		int[] inarray = array;
		if( finalArray == null )
		{
			inarray = inputarray;
		}
		System.out.println("\n");
		for( int i = 0; i < array.length; i++ )
		{
			System.out.print(array[i] + " \t");
		}

	}
}
