package com;

import java.util.*;
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array[] = new int[size];
		
		for(int i=0; i<size; i++) {
			
			Array[i] = sc.nextInt();		
		}
		
		for(int i=0; i<size; i++) {
			
			if(i%2!=0) {
				System.out.println(Array[i]);
			}
			
			
		}

	}

}
