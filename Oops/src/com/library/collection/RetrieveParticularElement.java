package com.library.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RetrieveParticularElement 
{
 public static void main(String[] args) 
 {
	 HashSet<Object> h1 = new  HashSet<Object>();
	 h1.add(10);
	 h1.add(20);
	 h1.add(25);
	 h1.add("Hi");
	 h1.add(200);
	 h1.add(90);
	 h1.add(50);
	 System.out.println(h1);
	 
	 //To retrieve the particular element convert to ArrayList because Arraylist Index based so , But Hashset is not Index based.
	 
	 ArrayList<Object> a1 = new ArrayList<Object>(h1);
	 System.out.println(a1.get(2));
	
}
}
