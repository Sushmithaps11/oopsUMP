package com.filehandling.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{
public static void main(String[] args)
{
	File obj = new File("C:\\Users\\LENOVO\\Desktop\\Eclipse Oops\\Oops\\src\\com\\filehandling\\file\\myfile.txt");
	//Create file
	try
	{
		obj.createNewFile();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	//Write file
	try
	{
		FileWriter write = new FileWriter(obj);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your msg");
		String msg = sc.nextLine();
		write.write(msg);
		write.close();
		}
	catch(IOException e1)
	{
		e1.printStackTrace();
	}
	
	//Read file
	try
	{
		Scanner sc1 = new Scanner(obj);
		while(sc1.hasNext());
		{
			String lines = sc1.nextLine();
			System.out.println(lines);
		}
	}
	catch(IOException e2)
	{
		e2.printStackTrace();
	}
	
	if(obj.delete())
	{
		System.out.println("My file is deleted");
	}
	else
	{
		System.out.println("My file is Not deleted");
	}

}
}
