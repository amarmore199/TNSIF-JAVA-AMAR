package com.tnsif.dayeleven.multithread;


public class Demo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread = new ThreadLifeCycleDemo();
		
		System.out.println("before Runnable State Thread is alive or not" + myThread.isAlive());
		
		
		myThread.start();
		
		try {
			Thread.sleep(450);
		}
		catch(InterruptedException e) {
			
			System.err.println(e.getMessage());
			
		}

	}

}
