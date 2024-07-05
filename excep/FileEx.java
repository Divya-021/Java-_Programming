package com.kiet.excep;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\Divya\\KIET\\java\\2023-24\\Moodle\\Programs\\abc.txt");
		System.out.println(f.isAbsolute()?"true":"False");
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists()?" yes":" No");
		System.out.println("Last modified "+f.lastModified());
		System.out.println("Length "+f.length());
		System.out.println("Read "+f.canRead());
	}

}
