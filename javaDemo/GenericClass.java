package com.kiet.javaDemo;

public class GenericClass<T> {
	T a;
	T b;
	
	public GenericClass(T a, T b) {
		this.a = a;
		this.b = b;
	}
	void sum() {
		Number n1=(Number)a;
		Number n2=(Number)b;
		System.out.println(n1.intValue()+n2.doubleValue());
		//System.out.println(a.intValue()+b.());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Double> gm=new GenericClass<Double>(2.3,5.2);
		gm.sum();
	}

}
