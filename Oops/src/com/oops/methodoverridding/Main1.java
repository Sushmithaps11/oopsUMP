package com.oops.methodoverridding;

class Father 
{
	public void bike()
	{
		System.out.println("Bullet");
	}

}
class Son extends Father
{
	@Override
	public void bike()
	{
		System.out.println("Modified Bike");
	}
}
public class Main1
{
	public static void main(String[] args) 
	{
		Son ump = new Son();
		ump.bike();
		
	}
}



