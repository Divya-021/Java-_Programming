package com.kiet.excep;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FCopyEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("D:\\Divya\\KIET\\java\\2023-24\\Moodle\\Programs\\abc.txt");
		FileOutputStream fout=new FileOutputStream("D:\\Divya\\KIET\\java\\2023-24\\Moodle\\Programs\\abc1.txt");
		int i=0;
		while((i=fin.read())!=-1)
				fout.write((char)i);
		/*do {
			i=fin.read();
			fout.write((char)i);
		}while(i!=-1);*/
		fout.close();
		fin.close();
		System.out.println("Successfully copied!!!");
	}

}
