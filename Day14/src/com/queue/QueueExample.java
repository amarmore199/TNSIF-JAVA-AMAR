package com.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        
        // ===================================
        // ✅ BASIC QUEUE USING LINKEDLIST
        // ===================================
        // LinkedList implements the Queue interface
        Queue<String> queue = new LinkedList<>();

        // Add elements using add() or offer()
        queue.add("Alice"); // add() throws exception if queue is full
        queue.add("sai");
        queue.add("Vaibhav");
        queue.add("anil");
        queue.add("Sanket");
        queue.offer("Bob");      // offer() returns false if it fails

        // View the head of the queue without removing
        System.out.println("Peek: " + queue.peek());  // returns null if empty

        // Remove elements using remove() or poll()
        System.out.println("Removed: " + queue.remove()); // throws exception if empty
        System.out.println("Polled: " + queue.poll());    // returns null if empty

        // Queue is now empty
        System.out.println("Peek (empty): " + queue.peek());

        // ===================================
        // 🔄 ITERATING OVER A QUEUE
        // ===================================
        queue.offer("Charlie");
        queue.offer("Diana");
        queue.offer("Eve");

        System.out.println("Iterating over queue:");
        for (String name : queue) {
            System.out.println(name); // Note: Queue does not support indexed access
        }

        // ===================================
        // 🚀 ADVANCED QUEUE: PRIORITYQUEUE
        // ===================================
        // Elements are ordered according to natural ordering (or comparator)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        System.out.println("\nPriorityQueue (Natural Order):");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Will print: 10, 20, 30
        }

        // ===================================
        // 🔧 CUSTOM PRIORITYQUEUE WITH COMPARATOR (Descending order)
        // ===================================
        Queue<Integer> customPQ = new PriorityQueue<>((a, b) -> b - a); // max-heap

        customPQ.offer(5);
        customPQ.offer(1);
        customPQ.offer(3);

        System.out.println("\nCustom PriorityQueue (Descending):");
        while (!customPQ.isEmpty()) {
            System.out.println(customPQ.poll()); // Will print: 5, 3, 1
        }

        // ===================================
        // ❌ COMMON QUEUE IMPLEMENTATIONS NOT ALLOWED
        // ===================================
        // Queue is an interface — you can't do this:
        // Queue<Integer> invalidQueue = new Queue<>(); // ❌ Compilation error

        // ===================================
        // 📦 OTHER QUEUE IMPLEMENTATIONS
        // ===================================
        // 1. ArrayDeque (for faster queue/stack operations)
        // 2. ConcurrentLinkedQueue (for multi-threaded environments)
        // 3. LinkedBlockingQueue (used in concurrency, fixed capacity)
    }
}
