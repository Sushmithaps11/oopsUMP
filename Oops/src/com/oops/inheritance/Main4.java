//  Hierarchical Inheritance

package com.oops.inheritance;

class Account
{
	long accno;
	String name;
	double bal;
	
	public void Deposit(double amt)
	{
		bal = bal + amt;
		System.out.println("Deposited Amt :" + amt + "Current Bal :" + bal);
	}
	
	public void Withdraw(double amt)
	{
		bal = bal - amt;
		System.out.println("Withdraw Amt :" + amt + "Current Bal :" + bal);
	}
	
}

class Savings extends Account
{
	double ROI = 0.5;
	
	public void CalculateROI()
	{
		bal = bal + bal*0.5;
		System.out.println("Balance with ROI :" + bal);
	}
}

class Current extends Account
{
	double minbal = 2500.0;
	
	public void Showminbal()
	{
		System.out.println(minbal);
	}
}

public class Main4 
{
	public static void main(String[] args)
	{
		Current ump = new Current();
		ump.Showminbal();
		ump.Deposit(50000.0);
		ump.Withdraw(10000.0);
		
		System.out.println("-------------------------------------------");
		
		Savings smp = new Savings();
		smp.Deposit(40000.0);
		smp.Withdraw(10000.0);
		smp.CalculateROI();
				
	}

}
