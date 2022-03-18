package com.interview.algorithms;

import java.util.Scanner;

public class Fibonacci {

	public static void main( String[] args )
	{

		//        //A program to Print fibonacci Numbers
		System.out.println("Please enter your Inpur number");
		Scanner input = new Scanner(System.in);
		input.nextInt();

		int inputNumber = 7;

		//Method Call
		System.out.println("Fibonacci number found through recursion :" + fibonacciRec(inputNumber));
		System.out.println("Fibonacci number found through Looping :" + fibonacciLoop(inputNumber));

	}

	//Recursive fibonacci 
	public static int fibonacciRec( int fibNum )
	{
		if( fibNum == 0 )
			return 0;

		if( fibNum == 1 )
			return 1;

		return fibonacciRec(fibNum - 1) + fibonacciRec(fibNum - 2);

	}

	//Loop through fibonacci 
	public static int fibonacciLoop( int input )
	{
		int fibNum = 0;

		if( input == 0 )
			fibNum = 0;

		if( input == 1 || input == 2 )
			fibNum = 1;

		int lastNumber = 1;
		int lastButOne = 1;

		for( int i = 3; i <= input; i++ )
		{

			fibNum = lastNumber + lastButOne;
			lastButOne = lastNumber;
			lastNumber = fibNum;

		}
		return fibNum;

	}
}
