package com.kiet.excep;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		t.setName("MyMain");
		System.out.println(t);
		Thread t1=new Thread();
		t1.setName("MyThread");
		t1.start();
		System.out.println("t1: "+ t1.isAlive());
	}
}