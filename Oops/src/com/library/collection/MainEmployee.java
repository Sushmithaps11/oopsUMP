package com.library.collection;

import java.util.ArrayList;

class Employee
{
	String name;
	double sal;
	int id;
	
	public Employee(String name, double sal, int id)
	{
		super();
		this.name = name;
		this.sal = sal;
		this.id = id;
	}
	public String toString()
	{
		return "Emp Detials[name : " +name + ",sal : " + sal + ", id" + id +"]";
	}
	
}
public class MainEmployee 
{
	public static void main(String[] args) 
	{
		//create Employee Objects
		Employee e1 = new Employee("e1",15000.0,101);
		Employee e2 = new Employee("e2",16000.0,102);
		Employee e3 = new Employee("e3",17000.0,103);
		Employee e4 = new Employee("e4",18000.0,104);
		
		//add employees to list
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e3);
		elist.add(e4);
		elist.add(e1);
		elist.add(e2);
		System.out.println(elist);
		
		//Retrieve
		for(int i=0; i<=elist.size()-1; i++)
		{
			System.out.println(elist.get(i));
		}
	}

}
