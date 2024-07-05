package com.kiet.excep;

class Earning extends Thread{
	int total=0;
	public void run() {
		for(int i=1;i<=10;i++) {
			total=total+100;
		}
		this.notify();
	}
}
public class Ticket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Earning t=new Earning();
		t.start();
		synchronized(t){
			t.wait();
		}
		
		System.out.println("Total tickets earning: "+t.total);
	}

}
