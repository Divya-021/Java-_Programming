package com.kiet.javaDemo;

abstract class Base
{
	void in()
	{
		System.out.println("input");
	}
	abstract void out();
}
class child1 extends Base
{

	//@Override
	void out() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}
	
}
public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base ob=new Base();
		child1 c=new child1();
		c.in();
		c.out();
	}

}
