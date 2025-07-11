package com.tnsif.dayeleven.trycatch;

public class TryCatchExample {
	
	
	 static void  performDivision(int x , int y) {
		 
		 try {
		 int z = x/y;
		 System.out.println("Result of z :"+ z);
		 }
		 catch(ArithmeticException e){
			 
			 System.err.println("Cannot divide by zero");
			 
		 }
	 }
}
