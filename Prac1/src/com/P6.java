package com;


import java.util.*;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array2[] = new int [size];
		
		for(int i=0; i<size; i++) {
			Array2[i]= sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
			
		       if(Array2[i]<10) {
		    	   System.out.println(Array2[i]+" ");
		       }
		}

	}

}
