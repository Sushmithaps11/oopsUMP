package com.library.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(1);
		a.add(10);
		a.add(15);
		a.add("Hello");
		a.add(1);
		a.add(20);
		a.add(15);
		System.out.println(a);
		
		// To remove the Duplicates convert ArrayList to HashSet
		
		HashSet<Object> h1 = new HashSet<Object>(a);
		System.out.println(h1);
		
	}

}
