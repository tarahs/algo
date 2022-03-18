package com.interview.algorithms;

import java.util.Arrays;

public class ArrayOperations {

	static int array[] = new int[] { 0, 1, 2, 4, 5 };

	public static void main( String[] args )
	{

		System.out.println("**********Array list is********");
		printArrayList();
		insertElement(3, 4);
		deleteElement(5);
		searchElement(2);
	}

	static void insertElement( int inputItem, int insertIndex )
	{

		array = Arrays.copyOf(array, array.length + 1);

		int lastIndex = array.length - 2;

		while( lastIndex >= (insertIndex - 1) )
		{
			array[lastIndex + 1] = array[lastIndex];
			lastIndex--;
		}

		array[insertIndex - 1] = inputItem;
		System.out.println("\n\n**********Array list after inserting********");
		printArrayList();

	}

	public static void deleteElement( int index )
	{
		index = index - 1;
		while( index < (array.length - 1) )
		{
			array[index] = array[index + 1];
			index++;
		}
		array = Arrays.copyOf(array, (array.length - 1));
		System.out.println("\n\n**********Array list after deleting 4th Position Value********");
		printArrayList();
	}

	public static void printArrayList()
	{
		for( int i = 0; i < array.length; i++ )
		{
			System.out.print(array[i] + "\t");
		}
	}

	static void searchElement( int input )
	{

		/**
		 * array with N elements and K is a positive integer such that K<=N 1. Start 2. Set J=0 3.
		 * Repeat steps 4 and 5 while j < N 4. IF A[j] is equal to ITEM THEN GOTO STEP 5 5. J = J+1;
		 * 6. PRINT J, ITEM; 5. STOP
		 * 
		 */
		for( int i = 0; i < array.length; i++ )
		{
			if( array[i] == input )
			{
				System.out.println("\n\nItem " + input + " found in the position " + (i + 1));
			}
		}

	}
}
