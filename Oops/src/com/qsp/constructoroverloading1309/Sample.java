package com.qsp.constructoroverloading1309;

public class Sample 
{
	public Sample()
	{
		System.out.println("Zero Arg Constructor");
	}
	public Sample(int a)
	{
		System.out.println("One Arg Constructor with int");
	}
	public Sample(String a)
	{
		System.out.println("One Arg Constructor with String");
	}
	public Sample(int a ,double b)
	{
		System.out.println("Two Arg Constructor with int and double");
	}
	public Sample(double a , int b)
	{
		System.out.println("One Arg Constructor with double and Int");
	}
	
	public static void main(String[] args) 
	{
		new Sample();
		new Sample(5);
		new Sample("Hello");
		new Sample(5,2.5);
		new Sample(5.5,8);
		
	}

}
