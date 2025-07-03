package arraytwo;

import java.util.*;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int product = 1;
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array9[] = new int [size];
		
		for(int i=0; i<size; i++) {
			Array9[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
		
			if(i%2!=0) {
				product = product * Array9[i];
			}
		}
		
		System.out.println(product);

	}

}
