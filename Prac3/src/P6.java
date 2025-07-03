import java.util.*;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		char Arr[] = new char [size];
		
		for(int i=0; i<size; i++) {
			Arr[i] = sc.next().charAt(0);
		}
		
		boolean constants = false;
		
		for(int i=0; i<size; i++) {
			
			char ch = Arr[i];
			
			if( ch== 'a' && ch=='e' && ch== 'o' && ch== 'u' && ch== 'i' && ch== 'A' && ch== 'E' && ch== 'O' && ch=='U' && ch=='I' ) {
                    System.out.println("Vowel found at index"+i+" "+Arr[i]);
				
				constants = true;
			}
		}
	}

}
