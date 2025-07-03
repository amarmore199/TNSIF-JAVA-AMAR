package arraytwo;

import java.util.*;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array8[] = new int [size];
		
		for(int i=0; i<size; i++) {
			
			Array8[i] = sc.nextInt();
			
			
	
		}
		
		for(int i=0; i<size; i++) {
			
			if(i%2==0) {
				sum = sum + Array8[i];
			}
		}
		
		System.out.println(sum);

	}

}
