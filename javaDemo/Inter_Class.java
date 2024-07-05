package com.kiet.javaDemo;

class AI implements IntA,IntB{

	
	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2: ");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1");
	}
	
}
public class Inter_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AI ob=new AI();
		ob.method1();
		ob.meth2();
		/*C ob1=new C();
		ob1.method1();
		ob1.method2();*/
	}

}
