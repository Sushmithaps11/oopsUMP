package com.library.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingElement 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(20);
		a1.add(150);
		a1.add(50);
		a1.add(200);
		a1.add(330);
		a1.add(220);
		a1.add(500);
		//a1.add(null);
		
		System.out.println("Before Sorting :"+ a1);
		
		// Sorting 
		Collections.sort(a1);
		
		System.out.println("After Sorting :"+ a1);
		
		// Sorting in descending Order
		Collections.sort(a1,Collections.reverseOrder());
		
		System.out.println("After Sorting :"+ a1);
	}

}
// We cannot sort Object class because CompareTo method is not present in object class
// If we want Sort User defined class means we should override the compareTo method in user defined class
// If we remove genrics means It will throw classcastException
// If we pass null means it will throw NullPointerException











