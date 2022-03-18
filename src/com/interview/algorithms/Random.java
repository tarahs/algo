package com.interview.algorithms;

import com.interview.constants.Day;
import com.interview.pojo.Employee;
import com.interview.pojo.Role;
import com.interview.utils.Util;

public class Random {

	int i = 0;

	public static void main( String[] args )
	{

		//instanceof
		Object s = 14;
		if( s instanceof String )
			System.out.println("True");
		else
			System.out.println("False");

		printDay(3);

		terminateNestedLoops();

		arbitraryParam("This", "is", "Tara");

		int i = 10;
		passPrimitive(i);
		System.out.println("Value after a method return " + i);

		String name = "Tara";
		passString(name);
		System.out.println("Value after a method return " + name);

		int[] list = new int[] { 1, 2, 4, 5 };
		passList(list);
		System.out.println("\nValue after a method return \n");
		Util.printIntArray(list);

		Employee employee = new Employee();
		employee.setFname("Tara");
		employee.setLname("Sudarshan");
		passObject(employee);
		System.out.println("Value after a method return " + employee.getFname() + " " + employee.getLname());

		Role role = new Role("SE", "Developing");
		employee.setRole(role);
		System.out.println("************" + role.getResposibility());

		/**** enumest *******/
		EnumTest enumTest = new EnumTest(Day.SUNDAY);
		enumTest.tellABoutDay();

	}

	static void printDay( int day )
	{

		switch ( day )
		{
			case 1 :
				System.out.println("Monday");
				break;

			case 2 :{
				System.out.println("Tuesday");
				break;
			}

			case 3 :
				System.out.println("Wednesday");
				break;

			case 4 :
				System.out.println("Thursday");
				break;

			case 5 :
				System.out.println("Friday");
				break;

			case 6 :
				System.out.println("Saturday");
				break;

			case 7 :
				System.out.println("Sunday");
				break;

			case 0 :
				System.out.println("Invalid Number");
				break;

			default :
				System.out.println("Invalid Number");
				break;
		}
	}

	static void terminateNestedLoops()
	{

		outerloop: for( int i = 0; i < 10; i++ )
		{
			secondOuterLoop: for( int j = 0; j < 10; j++ )
			{
				thirdOuterLoop: for( int k = 0; k < 10; k++ )
				{
					if( i == j && j == k )
					{
						System.out.println(
								"matching number " + (i + 1) + " found in the " + i + " interation of firstLoop and "
										+ j + " iteration of second loop and " + k + " iteration of third loop");
						break outerloop;
					}

				}
			}
		}
	}

	static void arbitraryParam( String... strings )
	{
		for( String s : strings )
		{
			System.out.print(s.toUpperCase() + " ");
		}
	}

	/* Pass by Value */
	static void passPrimitive( int i )
	{
		i = 12;
		System.out.println("\n Value within a method " + i);

	}

	/* Pass by Value */
	static void passString( String s )
	{
		s = "Sheela";
		System.out.println("\n Value within a method " + s);
	}

	/* Pass by Value */
	static void passList( int[] list )
	{

		list = new int[] { 7, 8, 9, 10 };
		System.out.println("\n Value within a method \n");
		Util.printIntArray(list);
	}

	/* Pass by Reference */
	static void passObject( Employee employee )
	{

		employee.setFname("Sheela");
		employee.setLname("Sudarshan");
		System.out.println("Value in a  method " + employee.getFname() + " " + employee.getLname());
	}

	public static void accessVariable()
	{
		Random random = new Random();
		random.i++;
		random.test();
	}

	void test()
	{

	}

}
