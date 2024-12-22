//Multilevel Inheritance

package com.oops.inheritance;

class WhatsupV1
{
	public void sendmsg()
	{
		System.out.println("Send msg of V1");
	}
}

class WhatsupV2 extends WhatsupV1
{
	public void voicemsg()
	{
		System.out.println("Voice msg of V2");
	}
}
class WhatsupV3 extends WhatsupV2
{
	public void videocall()
	{
		System.out.println("Video call of V3");
	}
}
public class Main3 
{
	public static void main(String[] args) 
	{
		WhatsupV3 ump = new WhatsupV3();
		ump.videocall();
		ump.voicemsg();
		ump.sendmsg();
	}

}
