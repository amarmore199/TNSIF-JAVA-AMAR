import java.util.*;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		
		for(int i=0; i<size; i++) {
		  arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			
			if(arr[i]%2==0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		}

	}

}
