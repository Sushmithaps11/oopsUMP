package com.qsp.constructoroverloading1309;

public class Samplebythis 
{
   public Samplebythis()
   {
	   
	   System.out.println("Zero Arg Constructor");
   }
   public Samplebythis(int a)
   {
	   this();
	   System.out.println("One Arg Constructor with int");
   }
   public Samplebythis(String a)
   {
	   this(5);
	   System.out.println("One Arg Constructor with String");
   }
   public Samplebythis(int a,double b)
   {
	   this("U");
	   System.out.println("Two Arg Constructor with int and double");
   }
   public Samplebythis(double b , int a)
   {
	   this(5,10.0);
	   System.out.println("Two Arg Constructor with double and int");
   }
   public static void main(String[] args) 
   {
	new Samplebythis(10.0,5);
}
   
}
