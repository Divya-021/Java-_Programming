package com.kiet.excep;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*for(int i=0;i<10;i++)
		{
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+" Even");
			else
				System.out.println(Thread.currentThread().getName()+" Odd");
		}*/
		if(Thread.currentThread().isDaemon())
			System.out.println(Thread.currentThread().getName()+" Daemon");
		else
			System.out.println(Thread.currentThread().getName()+" Non- Daemon");
	}
	
}
public class RunnableEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread1 t=new MyThread1();
		Thread t1=new Thread(t);
		t1.setDaemon(true);
		
		t1.start();
		MyThread1 t2=new MyThread1();
		Thread t3=new Thread(t2);
		t3.start();
		t1.join();
		
	}

}
