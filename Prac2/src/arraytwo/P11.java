package arraytwo;

import java.util.*;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Array7[] = new int [size];
		
		for(int i=0; i<size; i++) {
			Array7[i] = sc.nextInt();
		}
		
		 int max = Array7[0];
		for(int i=1; i<size; i++) {
			
			if(max<Array7[i]) {
				
				max = Array7[i];
			}
			
		}
		
		System.out.println(max);
	}

}
