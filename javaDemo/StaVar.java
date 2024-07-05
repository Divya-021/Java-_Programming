package com.kiet.javaDemo;

public class StaVar {
//	int a;
	static int b;
	static {
		//b=20;
		System.out.println("static block");
	}
	StaVar()
	{
		b=20;
		System.out.println("default constructor");
	}
	{
		System.out.println("instance block");
	}
	/*static void in()
	{
		//a++;
		b++;
		System.out.println(" b: "+b);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		StaVar st=new StaVar();
		
		
	}

}
