package com.tnsif.dayeight.abstractionclassdemo;

public abstract class Shape {
    
    protected double area; // Field to store the area of the shape
    
    public abstract void calArea(); // Abstract method - must be implemented by subclasses
    
    // Concrete method that displays the area
    public void show() {
        System.out.println("Area of Shape is: " + area);
    }
}
