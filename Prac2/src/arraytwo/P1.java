package arraytwo;

import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array6 [] = new int[size];
		
		for(int i=0; i<size; i++) {
			
			Array6[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			
			if(Array6[i]%2==0) {
				System.out.println(Array6[i]);
				count++;
			}
			
			System.out.println(count);
		}
		

	}

}
