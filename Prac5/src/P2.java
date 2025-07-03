import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		String name ;
		
		int id ;
		
		String city;
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the id");
		id = sc.nextInt();
		System.out.println("City");
		city = sc.next();
		
		System.out.println(" ");
		
		P1 a = new P1();
		
		a.setCustomerCity(city);
		a.setCustomerId(id);
		a.setCustomername(name);
		System.out.println(a);
		
		P1 c = new P1(city,id,name);
		c.setCustomerCity(city);
		c.setCustomerId(id);
		c.setCustomername(name);

	}

}
