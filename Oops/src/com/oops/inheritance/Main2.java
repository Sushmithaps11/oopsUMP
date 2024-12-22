  // Single Inheritance


package com.oops.inheritance;
class Sample 
{
	final int v1=0;
	String str;
	
	public void test()
	{
		System.out.println("Test of superclass");
	}
	public void count()
	{
		System.out.println("Count of superclass");
	}
}
class Demo extends Sample
{
	double z;
	
	public void display()
	{
		System.out.println("Display of subclass");
	}
}


public class Main2 
{
	public static void main(String[] args) 
	{
		Demo ump = new Demo();
		ump.display();
		ump.count();
		ump.test();
		System.out.println(ump.v1);
		System.out.println(ump.z);
		System.out.println(ump.str);
	}

}
