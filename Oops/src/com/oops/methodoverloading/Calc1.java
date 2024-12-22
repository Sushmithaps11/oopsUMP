package com.oops.methodoverloading;

public class Calc1
{
	public static int add(int a, int b)
	{
		int res = a+b;
		System.out.println(res);
		return res;
		
	}
	
	protected void add(int a, int b, int c)
	{
		int res = a+b+c;
		System.out.println(res);
		
	}
	void add(int a, int b, int c, int d)
	{
		int res = a+b+c+d;
		System.out.println(res);
	}
	
	public static void main(String[] args) 
	{
		Calc1 ump = new Calc1();
		add(5,6);
		ump.add(4, 8, 5);
		ump.add(6,4,2,3);
		
	}
	

}
