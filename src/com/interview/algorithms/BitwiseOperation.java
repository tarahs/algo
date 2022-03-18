package com.interview.algorithms;

public class BitwiseOperation {

	public static void main( String[] args )
	{

		sumWithoutOperarors();
	}

	public static void sumWithoutOperarors()
	{
		int a = 3;
		int num1 = a;
		int b = 6;
		int num2 = b;
		while( b != 0 )
		{
			System.out.println("\nITERATION");
			int carry = a & b;
			System.out.print("Carry is " + carry + "\t");
			a = a ^ b;
			System.out.print("number 1 is " + a + "\t");
			b = carry << 1;
			System.out.print("number 2 is " + b + "\t");
		}
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + a);
	}

}
