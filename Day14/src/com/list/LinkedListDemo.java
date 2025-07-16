package com.list;

import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		  LinkedList<String> fruits = new LinkedList<>();
		  
		  fruits.add("Apple");
		  
		// Adding elements
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        // Adding elements at specific positions
	        fruits.addFirst("Mango");  // Adds at the beginning
	        fruits.addLast("Orange");  // Adds at the end

	        // Accessing elements
	        System.out.println("First fruit: " + fruits.getFirst());
	        System.out.println("Last fruit: " + fruits.getLast());

	        // Removing elements
	        fruits.removeFirst();  // Removes Mango
	        fruits.removeLast();   // Removes Orange

	        // Iterating over the LinkedList
	        System.out.println("Fruits list:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	        
	        // Forward traversal
	        ListIterator<String> iterator = fruits.listIterator();
	        System.out.println("Forward traversal:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

		
		
	}
	
	

}
