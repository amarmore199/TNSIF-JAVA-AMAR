package com;

import java.util.*;

public class P8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc =new Scanner(System.in);
		
		int Emp = sc.nextInt();
		
		int age [] = new int [Emp];
		
		for(int i=0; i<Emp; i++) {
			
			age[i] = sc.nextInt();
			
			
		}
		
		for(int i=0; i<Emp; i++) {
			
			System.out.println(age[i]);
			count++;
		}
		
		System.out.println(count);
		
		
		
		

	}

}
