package com.kiet.excep;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileoutputEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileOutputStream fout=new FileOutputStream("D:\\Divya\\KIET\\java\\2023-24\\Moodle\\Programs\\abc1.txt");
		String s="Hello my file handling program";
		byte b[]=s.getBytes();*/
		FileWriter fout=new FileWriter("D:\\Divya\\KIET\\java\\2023-24\\Moodle\\Programs\\xyz1.txt");
		String s="Hello my file handling program";
		fout.write(s);
		fout.close();
		System.out.println("successful write");
	}

}
