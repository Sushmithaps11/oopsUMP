package com.qsp.constructoroverloading1309;

public class Empconstructorloading
{
    String name;
    String empid;
    double sal;
    int exp;
    
    public  Empconstructorloading(String name,String empid,double sal,int exp)
    {
    	this.name = name;
    	this.empid = empid;
    	this.sal = sal;
    	this.exp = exp;
    }
    public  Empconstructorloading(String name,String empid,double sal)
    {
    	this.name = name;
    	this.empid = empid;
    	this.sal = sal;
    }
    public void checkdetials()
    {
    	System.out.println(name + "\n" + empid + "\n" + sal + "\n" + exp);
    }
    
    public static void main(String[] args) 
    {
    	Empconstructorloading ump = new Empconstructorloading("Ump","H20",5000.0,4);
    	Empconstructorloading smp = new Empconstructorloading("Smp","P10",4000.0,2);
    	ump.checkdetials();
    	smp.checkdetials();
		
	}
}
