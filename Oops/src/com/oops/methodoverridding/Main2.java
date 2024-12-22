package com.oops.methodoverridding;

class Account
{
long accno;
String name;
double bal;

public Account(long accno , String name , double bal)
{
	super();
	this.accno = accno;
	this.name = name;
	this.bal = bal;
}

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

public Savings(double ROI , long accno , String name , double bal)
{
	super(accno,name,bal);
	this.ROI = ROI;
}

public void CalculateROI()
{
	bal = bal + bal*0.5;
	System.out.println("Balance with ROI :" + bal);
}

@Override
public void Withdraw(double amt)
{
	if(bal>amt)
	{
		bal = bal - amt;
		System.out.println("Withdraw Amt :" + amt + "Current Bal :" + bal);
	}
	else
	{
		System.out.println("Insufficient Balance");
	}
}

public void Displaydetials()
{
    System.out.println(name + "," + accno + "," + bal + "," +ROI);	
}
}

class Current extends Account
{
double minbal = 5000.0;

public Current(double minbal , long accno , String name , double bal)
{
	super(accno,name,bal);
	this.minbal = minbal;
}

 @Override
public void Withdraw(double amt)
{
	if(amt >=0 && bal - minbal >=amt)
	{
		bal = bal - amt;
		System.out.println("Withdraw Amt :" + amt + "Current Bal :" + bal);
	}
	else
	{
		System.out.println("Insufficient Balance");
	}
}
 public void Displaydetials()
 {
     System.out.println(name + "," + accno + "," + bal + "," + minbal);	
 }
 
}

public class Main2
{
public static void main(String[] args)
{
	Current ump = new Current(5000.0,946465564l,"Ump",0.0);
	
	ump.Deposit(50000.0);
	ump.Withdraw(30000.0);
	ump.Displaydetials();
	
	System.out.println("-------------------------------------------");
	
	Savings smp = new Savings(0.5,464156415l,"Smp",0.0);
	smp.Deposit(40000.0);
	smp.Withdraw(10000.0);
	smp.CalculateROI();
	smp.Displaydetials();
			
}
}


