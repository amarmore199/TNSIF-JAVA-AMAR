package com.tnsif.dayeleven.multithread;

public class ThreadLifeCycleDemo extends Thread {
	
	
	public void run() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	int num=0;
	while(num<4) {
		num++;
		System.out.println("num= "+ num);
	}

	try {
		sleep(500);
		System.out.println("is alive"+ isAlive());
	}
	catch(InterruptedException e) {
		
		System.err.println("Thread interrupted........."+ e);
		
	}
}
