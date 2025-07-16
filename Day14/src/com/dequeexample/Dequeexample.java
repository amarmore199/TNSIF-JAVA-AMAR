package com.dequeexample;

import java.util.*;

public class Dequeexample {
	
	  public static void main(String[] args) {
	        // Create a Deque
	        Deque<String> deque = new ArrayDeque<>();

	        // Add elements to the front and rear
	        deque.addFirst("Front1");
	        deque.addLast("Rear1");
	        deque.offerFirst("Front2");
	        deque.offerLast("Rear2");

	        // Print deque
	        System.out.println("Deque: " + deque);

	        // Peek elements
	        System.out.println("First Element: " + deque.peekFirst());
	        System.out.println("Last Element: " + deque.peekLast());

	        // Remove elements from front and rear
	        System.out.println("Removed First: " + deque.removeFirst());
	        System.out.println("Removed Last: " + deque.removeLast());

	        // Final state
	        System.out.println("Deque after removals: " + deque);
	    }

}
