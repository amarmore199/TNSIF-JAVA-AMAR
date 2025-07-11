package com.tnsif.dayeleven.trycatch;

public class NestedtryCatch {
	
	public static void check() {
		
		String str = "TNS";
		
		int slength = str.length();
		
		System.out.println("String Length: "+ slength);
		
		String anotherString = null;
		
		int y=6;
		
		try {
			// Inner try block
			
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println("String length:"+ anotherString);
		}
		catch(NullPointerException e) {
			
			
		}
	}

}
