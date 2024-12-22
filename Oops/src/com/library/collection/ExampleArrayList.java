package com.library.collection;

import java.util.ArrayList;

public class ExampleArrayList 
{
public static void main(String[] args) 
{
	//Create ArrayList
	ArrayList<Object> alist = new ArrayList<Object>();
	
	//add elements
	
	alist.add(10);
	alist.add(5);
	alist.add(null);
	alist.add('A');
	alist.add("Ump");
	alist.add(null);
	alist.add(10);
	
	System.out.println("Size of Arraylist = " + alist.size());
	System.out.println(alist);
	
	//retrieve the elements 
	//get(int index) used to retrieve the data
	
	for(int i=0; i<alist.size(); i++)
	{
		System.out.println(alist.get(i));
	}
}
}
