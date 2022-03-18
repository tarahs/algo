package com.interview.algorithms;

import java.util.Scanner;

public class AnalogClock {

	public static void main( String[] args )
	{
		int hrs = 0;
		int mins = 0;

		System.out.println("Current time "+System.currentTimeMillis());

		System.out.println("Please enter hrs and minutes");
		@SuppressWarnings( "resource" )
		Scanner s = new Scanner(System.in);
		for( int i = 0; i < 2; i++ )
		{
			if( s.hasNext() )
			{
				if( i == 0 )
					hrs = s.nextInt();
				else
					mins = s.nextInt();
			}
			else
				System.out.println("Invalid Input");

		}

		findAngle(hrs, mins);
	}

	/**
	 * Find the angle between given hrs and mins
	 * @param hrs
	 * @param mins
	 */
	public static void findAngle( int hrs, int mins )
	{

		if( hrs > 12 || hrs < 1 || mins > 60 || mins < 1 )
			System.out.println("Invalid Input");

		if( hrs == 12 )
			hrs = 0;

		if( mins == 60 )
			mins = 0;

		//find the Angle of Hrs for the minutes and Hrs provided. Hrs hande moves at the rate of 0.5deg per min
		//Convert Hrs into minutes and multiply by degree rate of hrs hand per min
		int hrsHand = (int) (0.5 * (hrs * 60 + mins));

		//multiply by drgree rate of mins
		int minHand = mins * 6;

		//Find the Difference
		int difference = Math.abs(hrsHand - minHand);
		int minAng = ((360 - difference) < difference) ? (360 - difference) : difference;
		System.out.println("Angle is " + minAng);

	}

}
