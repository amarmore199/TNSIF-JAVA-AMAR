package com.basicsBank;

public class Account {
	private int accountID;
	private int customerID;
	private String type;
	private double balance;
	
	//Parameterized constructor
	public Account(int accountID, int customerID, String type, double balance) {
		
		this.accountID = accountID;
		this.customerID = customerID;
		this.type = type;
		this.balance = balance;
	}
	
	//getters and setters

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
	 
	
	
	
	
	
	
	

}
