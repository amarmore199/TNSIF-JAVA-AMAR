package com.tnsif.dayeleven.trycatch;

import java.util.*;

public class Division {
	
	public static void divide() {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number :");
		
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a/b;
			
			System.out.println("Division is: "+ c);
		}
		catch(InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		catch(Exception e) {
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Division.divide();
	}
	
	

}
