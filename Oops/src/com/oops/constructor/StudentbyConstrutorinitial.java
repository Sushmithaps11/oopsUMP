package com.oops.constructor;

public class StudentbyConstrutorinitial 
{
	String name ;
	long mobile;
	String email;
	String degree;
	
	public StudentbyConstrutorinitial(String name,long mobile ,String email, String degree)
	{
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.degree = degree;
	
	}
	
	
	public void detials()
	{
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(email);
		System.out.println(degree);
	}
	
	public static void main(String[] args)
	{
		StudentbyConstrutorinitial ump = new StudentbyConstrutorinitial("Ulivesh", 9945269620l, "ump@gmail.com", "BSc");
		ump.detials();
		
		StudentbyConstrutorinitial smp = new StudentbyConstrutorinitial("Smp",979454515l,"smp@gmail.com","BE");
		smp.detials();
		
	}
	

}
