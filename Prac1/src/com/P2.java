package com;

import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[]{10,20,30,40,50,80,130,154,123,45,20};
		
		for(int i=0; i<arr.length; i++) {
			
			if(i==arr.length-1) {
				System.out.println(arr[i]);
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	

}
