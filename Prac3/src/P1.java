
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int size =sc.nextInt();
		
		int Arr[] = new int [size];
		
		for(int i=0; i<size; i++) {
			Arr[i] = sc.nextInt();
			
		}
		
		for(int i=0; i<size; i++) {
			
			System.out.println(Arr[i]+15);
		}

	}

}
