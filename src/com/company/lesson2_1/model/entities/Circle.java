package com.company.lesson2_1.model.entities;


public class Circle extends Shape {

    private double radi;
    private final double pi = Math.PI;

    Circle(String color, double radi){
        super(color);
        this.radi=radi;
    }

    @Override
    public double calcArea() {
        return pi*Math.pow(radi,2);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
