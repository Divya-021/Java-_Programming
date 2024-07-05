package com.kiet.javaDemo;
class A
{
	
	A()
	{
		System.out.println("base");
		
	}
	
}
class B extends A{
	
	B()
	{
		System.out.println("dervied");
	}
	
	
}
public class DerivedCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
	
	}

}
