package com.kiet.javaDemo;

import java.util.Scanner;

public class Employee {

	int EmpCode;
	String Ename;
	void in()
	{
		Scanner sc=new Scanner(System.in);
		EmpCode=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		//sc.next();
		Ename=sc1.nextLine();
	}
	void out()
	{
		System.out.println("code: "+EmpCode+" Name: "+Ename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e=new Employee[2];
		for(int i=0;i< e.length;i++)
		{
			e[i]=new Employee();
		}
		for(int i=0;i< e.length;i++)
		{
			e[i].in();
			e[i].out();
		}
		
		
		
		
		
		
		/*Employee e=new Employee();
		e.in();
		e.out();*/
	}

}
