package com.interview.pojo;

public class Role {

	public String role;
	public String resposibility;

	public Role()
	{

		this("test", "this");

	}

	public Role( String role, String res )
	{
		this.role = role;
		this.resposibility = res;

	}

	public String getRole()
	{
		return role;
	}

	public String getResposibility()
	{
		return resposibility;
	}

	public void setRole( String role )
	{
		this.role = role;
	}

	public void setResposibility( String resposibility )
	{
		this.resposibility = resposibility;
	}

}
