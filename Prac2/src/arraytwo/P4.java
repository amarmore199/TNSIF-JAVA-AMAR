package arraytwo;

import java.util.*;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		char[] ch =new char[size];
		
		for(int i=0; i<size; i++) {
			
			ch[i]= sc.next().charAt(0);			
			
		}
		
		// Step 4 : Check for vowels and print the index
		
		boolean vowelFound = false;
		
		for(int i=0; i<size; i++) {
			
			char c = ch[i];
			
			if(c == 'a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I' || c =='O' || c =='U') {
				System.out.println("Vowel found at index"+i+" "+ch[i]);
				
				vowelFound = true;
			}
		}
		
		// Step 5: If no vowel was found
		
		if(!vowelFound) {
			System.out.println("No vowels found in the array");
		}
		
		
		

	}

}
