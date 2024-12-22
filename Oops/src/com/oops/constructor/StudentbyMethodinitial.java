package com.oops.constructor;

public class StudentbyMethodinitial
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
	
	public void updatedetials(String name,long mobile ,String email, String degree)
	{
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.degree = degree;
	}
	
	public static void main(String[] args) 
	{
		StudentbyMethodinitial ump = new StudentbyMethodinitial();
		ump.updatedetials("Ulivesh", 9945269620l, "ump@gmail.com", "BSc");
		ump.detials();
		
		StudentbyMethodinitial smp = new StudentbyMethodinitial();
		smp.updatedetials("SMP", 979996997l, "smp@gmail.com", "BE");
		smp.detials();
		
	}
}
