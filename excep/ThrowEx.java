package com.kiet.excep;

import java.io.IOException;

class Vote{
	int age;
	void check(int a) throws Exception, IOException {
			if(a<18)
			{
				//System.out.println("not eligible");
				throw new Exception("not eligible");
			}
				
			else
				System.out.println("eligible");

		}
}
public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vote v=new Vote();
		try {
			v.check(5);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
