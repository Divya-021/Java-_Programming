package com.kiet.excep;

class Theater extends Thread{
	int total;
	public Object lock;
	public Theater(Object lock) {
		// TODO Auto-generated constructor stub
		this.lock=lock;
	}
	public void run() {
		synchronized(lock) {
			for(int i=1;i<=10;i++) {
				total=total+100;
			}
			lock.notifyAll();
		}
		
	}
}

public class MovieApp{
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Object lock = new Object();
		Theater t=new Theater(lock);
		t.start();
		Theater t1=new Theater(lock);
		t1.start();
		synchronized(lock) {
			lock.wait();	
		}
		
		//System.out.println("total earning: "+t.total);
		 int totalEarnings = t.total + t1.total;
	        System.out.println("Total earnings: " + totalEarnings);
	}

}
