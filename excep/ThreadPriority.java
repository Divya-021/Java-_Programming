package com.kiet.excep;

class ThreadP extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" thread running");
		System.out.println("Thread-0 "+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadP t=new ThreadP();
		t.start();
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("MAin: "+Thread.currentThread().getPriority());
	}

}
