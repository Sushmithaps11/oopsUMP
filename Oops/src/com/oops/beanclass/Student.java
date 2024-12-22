package com.oops.beanclass;

import java.io.Serializable;

public class Student implements Serializable
{
private String name;
private String email;
private long phone;

public String getname()
{
	return name;
}
public String getemail()
{
	return email;
}
public long getphone()
{
	return phone;
}
public void setname(String name)
{
	this.name = name;
}
public void setemail(String email)
{
	this.email = email;
}
public void setphone(long phone)
{
	this.phone = phone;
}

public static void main(String[] args) 
{
	Student ump = new Student();
	ump.setname("Ulivesh");
	ump.setemail("ump@gmail.com");
	ump.setphone(9945269620l);
	System.out.println(ump.getname());
	System.out.println(ump.getemail());
	System.out.println(ump.getphone());
	
	
}
}
