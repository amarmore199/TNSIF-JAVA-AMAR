package arraytwo;

import java.util.*;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array0[] = new int [size];
		for(int i=0; i<size; i++) {
			
			Array0[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
			
			if(Array0[i]>5 && Array0[i]<9) {
				
				System.out.println(Array0[i]+"is greater than 5 and"+Array0[i]+"is less than 9");
				
			}
			
		}

	}

}
