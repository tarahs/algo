package com.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Testcase {

	int numberOfQueries;
	String query;
}

public class InputRead {

	public static void main( String[] args )
	{

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer numberOfTestCases = Integer.parseInt(br.readLine());
			List<Testcase> testCases = new ArrayList<Testcase>(numberOfTestCases);
			int i = 0;
			while( i < numberOfTestCases )
			{
				i++;
				Testcase c = new Testcase();
				c.numberOfQueries = Integer.parseInt(br.readLine());
				c.query = br.readLine();
				testCases.add(c);
			}
			System.out.println(testCases.size());
			for( Testcase c : testCases )
			{
				System.out.println(c.numberOfQueries + " -- " + c.query);
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		Integer intd = new Integer("11");
		intd++;
		System.out.println(intd);
	}

}
