package com.oops.interface1;

interface Run1
{
	int a = 20;
	
	public void test1();
}

interface Run2
{
	public void test2();
}

class Demo
{
	public void test3()
	{
		System.out.println("Ulivesh");
	}
}

class Sample extends Demo implements Run1,Run2
{
	public void test1()
	{
		System.out.println("Test1 of Run1");
	}
	
	public void test2()
	{
		System.out.println("Test2 of Run2");
	}
}
public class Main1 
{
	public static void main(String[] args)
	{
		Sample s1 = new Sample();
		s1.test1();
		s1.test2();
		s1.test3();
	}

}
