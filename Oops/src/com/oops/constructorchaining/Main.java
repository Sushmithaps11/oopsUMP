package com.oops.constructorchaining;


 class Vehicle 
{
		String name;
		String type;
		int capacity;
		String number;
		
		public Vehicle(String name , String type ,int capacity, String number)
		{
			super();
			this.name = name;
			this.type = type;
			this.capacity = capacity;
			this.number = number;
		}
		public void displaydetails()
		{
			System.out.println(name + "," + type + "," + capacity + "," + number);
		}
}	
		class Bike extends Vehicle
		{
			int cc;
			String brand;
			
			public Bike(int cc , String brand , String name , String type ,int capacity, String number)
			{
			super(name,type,capacity,number);
			this.cc = cc;
			this.brand = brand;
			System.out.println(cc + "," + brand);
			}
		}
		

       public class Main 
       {
          public static void main(String[] args)
	{
		Bike b1 = new Bike(350,"Bullet","Enfield","2Wheeler",2,"KA01US2011");
			b1.displaydetails();
			b1.displaydetails();
		
		Vehicle v1 = new Vehicle("Royal","2Wheeler",2,"KA27US2011")	;
		v1.displaydetails();
	}
}


