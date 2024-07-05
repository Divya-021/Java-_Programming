package com.kiet.javaDemo;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {1,2,3};
		int[] a1=new int[5];
		int[][] a2=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr values");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("array is: ");
		for(int i:a1)
		{
			System.out.println(i);
		}
	}

}
