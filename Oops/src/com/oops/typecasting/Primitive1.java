package com.oops.typecasting;

public class Primitive1 
{
	public static void main(String[] args) 
	{
		// Widening
		int i1 = 100;
		double i2 = i1;
		System.out.println(i1);
		System.out.println(i2);
		
		// Narrowing
		double d1 = 100.22;
		int d2 = (int)d1;
		System.out.println(d1);
		System.out.println(d2);
		
		//Char , Widening
		char c1 = 'A';
		int c2 = c1;
		System.out.println(c1);
		System.out.println(c2);
		
		// float and int
		int a1 = 10;
		float f1 = a1;
		System.out.println(a1);
		System.out.println(f1);
		
		// One line code Narrowing
		int a2 = (int)10.25f;
		System.out.println(a2);
		
		char a3 = (char)17955;
		System.out.println(a3);
		
	}

}
