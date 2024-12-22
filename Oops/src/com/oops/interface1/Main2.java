package com.oops.interface1;

interface Photoedit
{
	public void Resize();
	public void Crop();
	public void Addfilter();
	
}
interface Post
{
	public void Like();
	public void Comment();
	public void Share();
}
interface Vedioedit
{
	public void Trim();
	public void Addaudio();
	public void Changespeed();
}

class Photo implements Photoedit,Post
{
	double size = 10.0;
	int resoulation = 480;
	String type = "Jpg";
	
	public void Collage()
	{
		System.out.println("Collage the Photos");
	}
	public void Resize()
	{
		System.out.println("Resize the Image");
	}
	public void Crop()
	{
		System.out.println("Crop the Image");
	}
	public void Addfilter()
	{
		System.out.println("Add filter the Image");
	}
	public void Like()
	{
		System.out.println("Like the Photo Post");
	}
	public void Comment()
	{
		System.out.println("Comment the Photo Post");
	}
	public void Share()
	{
		System.out.println("Share the Photo Post");
	}
}
	
	class Vedio implements Vedioedit,Post
	{
		double size = 20.0;
		int duration = 10;
		String quality = "HD";
		
		public void Minute()
		{
			System.out.println("Duration of Vedio");
		}
		public void Trim()
		{
			System.out.println("Trim the Vedio");
		}
		public void Addaudio()
		{
			System.out.println("Addaudio to Vedio");
		}
		public void Changespeed()
		{
			System.out.println("Change the speed of Vedio");
		}
		public void Like()
		{
			System.out.println("Like the Vedio Post");
		}
		public void Comment()
		{
			System.out.println("Comment the Vedio Post");
		} 
		public void Share()
		{
			System.out.println("Share the Vedio Post");
		}
	
}

public class Main2 
{
    public static void main(String[] args) 
    {
		Photo ump = new Photo();
		ump.Collage();
		ump.Resize();
		ump.Crop();
		ump.Addfilter();
		ump.Like();
		ump.Comment();
		ump.Share();
		System.out.println(ump.size);
		System.out.println(ump.resoulation);
		System.out.println(ump.type);
		
		System.out.println("----------------------------");
		
		Vedio smp = new Vedio();
		smp.Minute();
		smp.Trim();
		smp.Addaudio();
		smp.Changespeed();
		smp.Like();
		smp.Comment();
		smp.Share();
		System.out.println(smp.size);
		System.out.println(smp.duration);
		System.out.println(smp.quality);
	}
}

