package com.oops.inheritance;

class FlipkartOrder
{
	public void order()
	{
		System.out.println("Order Section");
	}
}
class Fashion extends FlipkartOrder
{
	public void men()
	{
		System.out.println("Mens Section");
	}
	public void women()
	{
		System.out.println("Womens Section");
		
	}
}
class Electronics extends FlipkartOrder
{
	public void laptop()
	{
		System.out.println("Laptops");
	}
	public void mobile()
	{
		System.out.println("Mobiles");
	}
}
class BrandofFashion extends Fashion
{
	public void puma(int choice)
	{
		switch(choice)
		{
			case 1: men();break;
			case 2: women();break;
			default : System.out.println("Invalid");
		}
	}
	public void nike(int choice)
	{
		switch(choice)
		{
			case 1: men();break;
			case 2: women();break;
			default : System.out.println("Invalid");
		}
	}
}
class BrandofElectronics extends Electronics
{
	public void dell(int choice)
	{
		switch(choice)
		{
			case 1: laptop();break;
	        default : System.out.println("Invalid");
		}
	}
	public void samsung(int choice)
	{
		switch(choice)
		{
			case 1: laptop();break;
			case 2: mobile();break;
			default : System.out.println("Invalid");
		}
	}
}
public class Main5 
{
	public static void main(String[] args) 
	{
		BrandofElectronics ump = new BrandofElectronics();
		ump.dell(1);
		ump.samsung(3);
		ump.mobile();
		ump.laptop();
		ump.order();
		
		System.out.println("--------------");
		
		BrandofFashion smp = new BrandofFashion();
		smp.puma(2);
		smp.nike(1);
		smp.men();
		smp.women();
		smp.order();	
	}
}
