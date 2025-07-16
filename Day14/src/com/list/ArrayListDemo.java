package com.list;

import java.util.List;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		
		List list = new ArrayList<>(); // Dynamic binding
		
		
		int a = sc.nextInt();
		
		list.add(a);
		/*list.add(30);
		list.add(40);
		list.add(90);
		list.add(20);*/
		
		// Add the elements
		System.out.println(list);
		
		// Check the empty elements
		System.out.println(list.isEmpty());
		
		// Check size
		
		System.out.println(list.size());
		
		// reverse
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		// Sort
		
		Collections.sort(list);
		
		System.out.println(list);
		
		// Traversing in List
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()) {
			String nm = i.next();
			System.out.println(nm+" ");
			
		}
		
		System.out.println();
		
		
		
		
		
		//Check the contain
		
		System.out.println(list.contains(20));
		
		// Remove elements
		
		
		try {
		System.out.println(list.remove(30));
		}
		catch(Exception e) {
			System.out.println("Enter valid value");
		}
		
		list.clear(); 
		
		System.out.println(list.isEmpty());
	}

}
