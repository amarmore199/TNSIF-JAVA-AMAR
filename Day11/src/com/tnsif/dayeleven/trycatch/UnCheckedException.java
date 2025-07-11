package com.tnsif.dayeleven.trycatch;

public class UnCheckedException {
	
	public static void main(String[] args) {
	
	int x[];
	
	try {
		x = new int[] {1,2,3,4,5,6};
		System.out.println(x[9]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		
		System.err.println("Enter the valid number");
		
	}

}
}