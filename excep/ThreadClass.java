package com.kiet.excep;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+ " "+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}			
			}
}
public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Started");
		/*for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}*/
		MyThread t1=new MyThread();
		t1.start();
		//t1.join();
		System.out.println(Thread.currentThread().getName()+" End");
	}

}
