package com.library.collection;

import java.util.ArrayList;

public class ExampleArrayList1 
	{
	 public static void main(String[] args) 
	 {
		 ExampleArrayList1 e1 = new ExampleArrayList1();
		 
		 ArrayList<Object> alist = new 	 ArrayList<Object>();
		 
		 alist.add(100);
		 alist.add("US");
		 alist.add(0,80);
		 alist.add(e1);
		// alist.addAll(alist);
		// alist.remove(0);
		// alist.removeAll(alist);
		 alist.remove("US");
		 
		 System.out.println(alist);
		 System.out.println(alist.contains(10));
		 System.out.println(alist.contains(20));
		 
		 
	}
	}


