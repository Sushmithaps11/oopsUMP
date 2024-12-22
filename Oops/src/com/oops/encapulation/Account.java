package com.oops.encapulation;

public class Account 
{
	private long accno;
	private String username;
	private double bal;
	
	public Account(long accno,String username)
	{
		this.accno=accno;
		this.username=username;
	}
	
	public long getaccno()
	{
		return accno;
	}
	public String getusername()
	{
		return username;
	}
	public double getbal()
	{
		return bal;
	}
	public void setaccno(long accno)
	{
		this.accno = accno;
	}
	public void setusername(String username)
	{
		this.username = username;
	}
	public void setbal(double bal)
	{
		this.bal = bal;
	}

}
