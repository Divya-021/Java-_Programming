package com.kiet.excep;

import java.util.Scanner;

public class Check_Uncheck {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		int num1,b,res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("num1: ");
		num1=sc.nextInt();
		System.out.println("b: ");
		b=sc.nextInt();
		try {
			a[4]=2;
			try {
				res=num1/b;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("exception caught 2");
			}
			finally {
				System.out.println("res: "+res);
			}
			
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught 1");
		}
		
		
	}

}
