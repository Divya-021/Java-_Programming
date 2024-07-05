package com.kiet.javaDemo;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,i,j,col;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row: ");
		row=sc.nextInt();
		int a[][]=new int[3][];
		for(i=0;i<a.length;i++)
		{
			System.out.println("enter column for row:"+(i+1));
			col=sc.nextInt();
			a[i]=new int[col];
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println("enter value for row: "+i);
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length ;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
