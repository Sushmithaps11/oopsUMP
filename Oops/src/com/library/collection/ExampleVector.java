package com.library.collection;

import java.util.Vector;

public class ExampleVector 
{
	
	public static void main(String[] args) 
	{
		//Create ArrayList
		Vector<Object> vlist = new Vector<Object>();
		
		//add elements
		
		vlist.add(10);
		vlist.add(5);
		vlist.add(null);
		vlist.add('A');
		vlist.add("Ump");
		vlist.add(null);
		vlist.add(10);
		
		System.out.println("Size of Vector = " + vlist.size());
		System.out.println(vlist);
		
		//retrieve the elements 
		//get(int index) used to retrieve the data
		
		for(int i=0; i<=vlist.size()-1; i++)
		{
			System.out.println(vlist.get(i));
		}
	
	}


}
