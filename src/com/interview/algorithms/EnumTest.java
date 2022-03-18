package com.interview.algorithms;

import com.interview.constants.Day;

public class EnumTest {

	Day day;

	EnumTest( Day day )
	{
		this.day = day;
	}


	public void tellABoutDay()
	{
		switch ( day )
		{
			case MONDAY :{
				System.out.println("Monday is a horrible Day");
				break;
			}
			case TUESDAY :{
				System.out.println("Tuesday is Okay!");
				break;
			}
			case WEDNESDAY :{
				System.out.println("WEDNESDAY is Sleepy!");
				break;
			}
			case THURSDAY :{
				System.out.println("THURSDAY is active!");
				break;
			}
			default :{
				System.out.println("This day is awesome");
				break;
			}
		}

		for( int i = 0; i < Day.values().length; i++ )
		{
			System.out.println("\n" + Day.values()[i]);
		}
	}

}
