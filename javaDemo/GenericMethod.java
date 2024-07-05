package com.kiet.javaDemo;

public class GenericMethod {
	
	<T>void disp(T a[]) {
		for(T i:a)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod gm=new GenericMethod();
		Integer a[]= {1,2,3};
		gm.disp(a);
	}

}
