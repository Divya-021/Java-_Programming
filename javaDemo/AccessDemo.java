package com.kiet.javaDemo;

class A1
{
	int a;
	void in()
	{
		System.out.println("a: "+a);
	}
}


public class AccessDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A1 obj=new A1();
		obj.a=10;
		obj.in();*/
		B1 ob=new B1();
		ob.b=5;
		ob.in();
	}

}
