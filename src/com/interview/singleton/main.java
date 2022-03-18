package com.interview.singleton;

public class main {

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub
		final EnumSingleton enumSingle = EnumSingleton.getInstance();
		System.out.println(enumSingle.getDbName());

	}

}
