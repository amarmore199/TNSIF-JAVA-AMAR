package com.tnsif.dayseven.overloading;

public class MethodOverloading {

	public static int addition(int a, int b) {   // Method overloading two parameter 
		
            int c = a+b;
            
            return c;
		
	}
	
	public static int addition(int a, int b, int d) {  // Method Overloading three parameter
		
        int c = a+b+d;
        
        return c;
	
   }
	
	
	public static float addition(float a, int b) { // Change the Data type
		
		return  a+b;
	}
	
	public static float addition(int a , float b) {
		return a+b;
	}
	
	
    public static void main(String[] args) {
    	MethodOverloading.addition(3, 0);
    	MethodOverloading.addition(3, 0);
    	MethodOverloading.addition(4, 40, 2);
    	MethodOverloading.addition(0, 0);
    }
	

}
