package com.oops.typecasting;

public class Primitive2 
{
	public static void test(int a)
	{
		System.out.println("int " + a);
	}
	public static void test(double a)
	{
		System.out.println("double " + a);
	}
	public static void main(String[] args) 
	{
		test(10);
		test('i');
		
		byte b1 =20;
		System.out.println(b1);
		
		short s1 = 250;
		System.out.println(s1);
		
		test(10.50);
	}

}
