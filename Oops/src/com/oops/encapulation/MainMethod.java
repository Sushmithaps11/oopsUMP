package com.oops.encapulation;

public class MainMethod 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account(4561531l,"Ump");
		Transaction t1 = new Transaction();
		t1.deposit(10000.0, a1);
		t1.checkbal(a1);
		t1.withdraw(5000.0, a1);
		t1.checkbal(a1);
		
		System.out.println("---------------------------------");
		
		Account a2 = new Account(154879l,"Smp");
		t1.deposit(8000.0, a2);
		t1.checkbal(a2);
		t1.withdraw(4000.0, a2);
		t1.checkbal(a2);
		
	}

}
