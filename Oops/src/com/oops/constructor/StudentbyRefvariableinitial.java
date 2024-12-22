package com.oops.constructor;

public class StudentbyRefvariableinitial
{
	String name ;
	long mobile;
	String email;
	String degree;
	
	
	public void detials()
	{
		System.out.println(name);
		System.out.println(mobile);
		System.out.println(email);
		System.out.println(degree);
	}
	
	public static void main(String[] args) 
	{
		StudentbyRefvariableinitial ump = new StudentbyRefvariableinitial();
		ump.name="Ulivesh"; ump.mobile=9945269620l; ump.email="ump@gmail.com"; ump.degree="BSc";
		ump.detials();
		
		StudentbyRefvariableinitial smp = new StudentbyRefvariableinitial();
		smp.name="SMP"; smp.mobile=79797641l; smp.degree="BE";
		smp.detials();
	}

}
