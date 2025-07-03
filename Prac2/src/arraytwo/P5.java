package arraytwo;

import java.util.*;
public class P5 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int Arr[] = new int [size];
		
		for(int i=0; i<size; i++) {
			
			Arr[i] = sc.nextInt();
			
			
		}

		int search = sc.nextInt();
		for(int i=0; i<size; i++) {
			
			if(search == Arr[i]) {
				System.out.println(i);
			}
			else {
			  System.out.println("no found");
			}
		}
	}

}
