package com.tnsif.dayeight.interfacedemo;

public interface Bank {
	
	float Minbal = 50000;
	final static float Deposit_Limit = 50000;
	
	public void deposit(float amount);
	
	public void withdraw(float amount);
	
	
	

}
