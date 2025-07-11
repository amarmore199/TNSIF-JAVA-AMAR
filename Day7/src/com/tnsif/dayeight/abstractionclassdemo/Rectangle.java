package com.tnsif.dayeight.abstractionclassdemo;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calArea() {
        this.area = height * width;
    }
}
