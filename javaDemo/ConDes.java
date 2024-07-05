package com.kiet.javaDemo;

class Cons{
	int a;
	Cons()
	{
	System.out.println("dafault");
	}
	Cons(int num)
	{
		a=num;
		System.out.println("a: "+a);
	}
	protected void finalize() {
		System.gc();
		System.out.println("Memory Released");
	}
}
public class ConDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c=new Cons();
		c.finalize();
	}

}
