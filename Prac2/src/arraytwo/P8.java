package arraytwo;

import java.util.*;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int size = sc.nextInt();
		
		int Array9[] = new int [size];
		
		for(int i=0; i<size; i++) {
			
			 Array9[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
			
			if(size%2==0) {
				
				if(i%2==0) {
					System.out.println(Array9[i]);
				}
				
			}
			else {
				System.out.println(Array9[i]);
			}
		}

	}

}
