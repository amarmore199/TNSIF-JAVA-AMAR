package com;

import java.util.*;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		String Array3[] = new String[size];
		
		for(int i=0; i<size; i++) {
			
			 Array3[i] = sc.next();
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(Array3[i]);
		}

	}

}
