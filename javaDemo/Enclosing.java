package com.kiet.javaDemo;

class outer{
	static int a=20;
	 static void out()
	{
		System.out.println("outer method: "+a);
		/*inner i=new inner();
		i.in();*/
	}
	static class inner{
		int b=10;
		void in()
		{
			System.out.println("inner method: "+(a+b));
			out();
		}
	}
}
public class Enclosing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer o=new outer();
		//o.out();
		outer.inner i=new outer.inner();
		i.in();
	}

}
;