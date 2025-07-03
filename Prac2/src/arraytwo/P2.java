package arraytwo;

import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array7 [] = new int [size];
		
		for(int i=0; i<size; i++) {
			Array7 [i] = sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
		
			
			
			if(Array7[i]%3==0) {
				System.out.println(Array7[i]);
				
				 sum = sum + Array7[i];
			}
		}
		
		System.out.println(sum);
		
		

	}

}
