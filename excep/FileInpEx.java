package com.kiet.excep;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInpEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fin=new FileReader("D:\\Divya\\KIET\\java\\2023-24\\Moodle\\Programs\\xyz.txt");
		/*int i=0;
		do {
			i=fin.read();
			System.out.print((char)i);
		}while(i!=-1);*/
		//char c[]=new char[50];
		int i=0;
		while((i=fin.read())!=-1)
		System.out.print((char)i);
	}

}
