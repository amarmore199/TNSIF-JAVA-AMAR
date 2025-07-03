package com;

import java.util.*;

class S1{
	
	float balance;
	int pass = 1234;
	
	
	
	void password() {
		
		while(true) {
		System.out.println("Enter the password");
		Scanner sc = new Scanner(System.in);
		
		int enterpass = sc.nextInt();
		
		if( enterpass == pass) {
			System.out.println("Welcome");
			menu();
		}
		else {
			System.out.println("Re-Enter Password");
		}
	}
	}
	
	
	void menu() {
		System.out.println("1.CHECK BALANCE");
		System.out.println("2.WITHDRAW");
		System.out.println("3.DEPOSIT");
		System.out.println("4.EXIT");
		
		Scanner sc = new Scanner(System.in);
		
		int opt = sc.nextInt();
		
		
		if(opt == 1) {
			check();
		}
		else if(opt == 2) {
			withdraw();
		}
		else if(opt == 3) {
			deposit();
		}
		else if(opt == 4) {
			return;
		}
		else {
			System.out.println("Enter the invalid");
		}
		
	}
	
	void check() {
		System.out.println("THIS IS YOUR CURRENT BALANCE"+balance);
		menu();
	}
	
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		
		float amount = sc.nextFloat();
	      if(amount > balance) {
	    	  System.out.println("Insufficient Balance");
	      }
	      else {
	    	  balance = balance - amount;
	    	  System.out.println("Successfully Withdrawl Amount");
	      }
	      
	      menu();
	}
	
	void deposit() {
		Scanner sc = new Scanner(System.in);
		
		int depo = sc.nextInt();
		
		balance = balance + depo;
		
		menu();
	}
	
	
	
	
	
}




public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S1 s = new S1();
		
		s.password();
		
		
	}

}
