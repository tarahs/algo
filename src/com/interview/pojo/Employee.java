package com.interview.pojo;

public class Employee {

	public String fname;
	public String lname;
	public Role role = new Role();

	public Employee()
	{

	}

	public Employee( String fname, String lname, Role role )
	{

	}

	public String getFname()
	{
		return fname;
	}

	public void setFname( String firstName )
	{
		fname = firstName;
	}

	public String getLname()
	{
		return lname;
	}

	public void setLname( String lstName )
	{
		lname = lstName;
	}

	public void setRole( Role role )
	{
		this.role = role;
		role.setResposibility("My res is Nothing!!!!!!!");
	}

	public Employee getEmployee()
	{
		return new Developer();
	}

}
