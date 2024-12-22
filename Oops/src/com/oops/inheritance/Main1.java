package com.oops.inheritance;

	 class Father 
	{
		public void bike()
		{
			System.out.println("Bullet");
		}

	}
	class Son extends Father
	{
		public void cycle()
		{
			System.out.println("Cycle");
		}
	}
	public class Main1
	{
		public static void main(String[] args) 
		{
			Son ump = new Son();
			ump.cycle();
			ump.bike();
			
		}
	}



