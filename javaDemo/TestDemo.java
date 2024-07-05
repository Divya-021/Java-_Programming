package com.kiet.javaDemo;

import java.util.Scanner;

public class TestDemo {

	int age;
	String name;
	TestDemo()
	{
		//System.out.println("Default constructor");
	}
/*	TestDemo(int a)
	{
		//this();
		age=a;
//		System.out.println("enter name: ");
//		Scanner sc=new Scanner(System.in);
//		name=sc.nextLine();
	}
	TestDemo(int age, String name)
	{
		//this(30);
		this.age=age;
		this.name=name;
	}
	TestDemo(TestDemo obj)
	{
		age=obj.age;
		name=obj.name;
	}*/
	void input()
	{
	System.out.println("input method");
	}
	void output()
	{
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TestDemo t=new TestDemo(10,"ram");
		TestDemo t1=new TestDemo(t);
		System.out.println("age: "+t.age+"name: "+t.name);
		System.out.println("age: "+t1.age+"name: "+t1.name);*/
		Scanner sc=new Scanner(System.in);
		TestDemo[] obj=new TestDemo[2];
//		obj.input();
//		obj.output();
		for(int i=0;i<obj.length;i++) {
			obj[i]=new TestDemo();
			System.out.println("enter age"+ (i+1));
			obj[i].age=sc.nextInt();
			sc.nextLine();
			System.out.println("enter name"+ (i+1));
			obj[i].name=sc.nextLine();
			//sc.next();
			//obj[i].output();
		}
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i].age);
			System.out.println(obj[i].name);
			
		}
	}

}
