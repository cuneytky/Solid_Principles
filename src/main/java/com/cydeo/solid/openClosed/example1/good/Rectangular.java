package com.cydeo.solid.openClosed.example1.good;

public class Rectangular implements Shape{
    private double height;
    private double width;

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }
}
