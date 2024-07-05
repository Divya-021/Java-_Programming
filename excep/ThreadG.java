package com.kiet.excep;

class MyThreadG implements Runnable{
	@Override
	public void run() {
		
		try {
			while(!Thread.currentThread().isInterrupted()) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+" Running");
			} }catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(Thread.currentThread().getName()+" Interrupted");

			}
		System.out.println(Thread.currentThread().getName()+" Running");
		}
		// TODO Auto-generated method stub
}

public class ThreadG {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg=new ThreadGroup("MyGroup");
		Thread t1=new Thread(tg,new MyThreadG(),"Thread1");
		Thread t2=new Thread(tg,new MyThreadG(),"Thread2");
		Thread t3=new Thread(tg,new MyThreadG(),"Thread3");
		/*MyThreadG r=new MyThreadG();
		Thread t4=new Thread(r);*/
		t1.start();
		
		t2.start();
		t3.start();
		ThreadGroup child=new ThreadGroup(tg,"Child");
		
		try {
			Thread.sleep(1000);
			t1.interrupt();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Active thread: "+tg.activeCount());
		System.out.println("Active group: "+tg.activeGroupCount());
		tg.list();
	}

}
