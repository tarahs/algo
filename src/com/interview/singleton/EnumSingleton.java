package com.interview.singleton;

/**
 * This is Upgraded in Java 5
 * 
 * @author tara
 *
 */
public enum EnumSingleton {

		INSTANCE;

	private final String dbName;

	private EnumSingleton()
	{
		dbName = "localDB";
	}

	public static EnumSingleton getInstance()
	{
		return EnumSingleton.INSTANCE;
	}

	public String getDbName()
	{
		return dbName;
	}

}
