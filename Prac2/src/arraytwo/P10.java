package arraytwo;

import java.util.*;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int size = sc.nextInt();
		
		int Arr[] = new int [size];
		
		for(int i=0; i<size; i++) {
			
			Arr[i] = sc.nextInt();
			
		}
		
		 int Min = Arr[0];
		for(int i=1; i<size; i++) {
			
           
            
            if(Min>Arr[i]) {
            	
            	  Min = Arr[i];
            }
			
			
	

	}
		System.out.println(Min);
		

}}
