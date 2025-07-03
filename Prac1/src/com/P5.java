package com;


import java.util.*;

public class P5 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int array1 [] = new int [size];
		
		for(int i=0; i<size; i++) {
			array1 [i] = sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
			
			if(array1[i]%2!=0) {
			
			System.out.println(array1[i]+" ");
			
			 sum = sum + array1[i];
			 
			
		}
			
		

	}
		
		 System.out.println(sum);

}}
