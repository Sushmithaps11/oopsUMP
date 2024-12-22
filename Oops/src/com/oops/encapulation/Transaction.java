package com.oops.encapulation;

public class Transaction 
{
	public void deposit(double amt , Account a1)
	{
		if(amt >=0)
		{
			double b1 = a1.getbal() + amt;
			a1.setbal(b1);
		}
		else 
		{
			System.out.println("Invalid amount");
		}
	}
	public void withdraw(double amt , Account a1)
	{
		if(amt <= a1.getbal() && amt>=0)
		{
			double b1 = a1.getbal() - amt;
			a1.setbal(b1);
		}
		else
		{
			System.out.println("Insufficient bal");
		}
	}
	public void checkbal(Account a1)
	{
		System.out.println("Current Bal of :"  + a1.getusername() + " Is Rs :" + a1.getbal());
	}

}
