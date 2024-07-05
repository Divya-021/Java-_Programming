package com.kiet.javaDemo;
class Par{
	final int a=10;
	void show()
	{
		//a=20;
		System.out.println("Parent show");
	}
	void disp()
	{
		System.out.println("Parent display");
	}
}
class child extends Par
{
	//@Override
	public void show()
	{
		System.out.println("Child show");
	}
	void print()
	{
		System.out.println("Child print");
	}
}
public class MethOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ob=new child();
		ob.disp();
		ob.print();
		ob.show();
	}

}
