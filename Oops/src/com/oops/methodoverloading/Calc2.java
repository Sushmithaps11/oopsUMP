package com.oops.methodoverloading;

public class Calc2 
{
	public static void add(int[]a)
	{
		int sum =0;
		for(int i=0; i<=a.length-1; i++)
		{
		sum = sum + a[i];	
		}
		System.out.println(sum);
	}
	public static void add(double[]a)
	{
		double sum =0;
		for(int i =0; i<=a.length-1; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int[]a1 = {2,6,4,3,5};
		add(a1);
		double[]a2 = {2.2,3.2,5.8,10.0};
		add(a2);
		
	}

}
