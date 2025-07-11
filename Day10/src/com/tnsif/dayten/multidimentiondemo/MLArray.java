package com.tnsif.dayten.multidimentiondemo;

 class MUlti{
	
	
	static void printArray(int c[] []) {
		System.out.println("Array of elements are as follows");
		for(int i=0; i<=c[i].length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.println(c[i][j]);
			}
			
			System.out.println();
		}
	}

}


class MLArray{
	public static void main(String[] args) {
		
		MUlti m = new MUlti();
		
		
	int 	c[][] = {{12,34},{12,33}};
	

	m.printArray(c);
	
	}
}
