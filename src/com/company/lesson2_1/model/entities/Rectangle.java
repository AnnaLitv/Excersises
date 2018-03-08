package com.company.lesson2_1.model.entities;

public class Rectangle extends Shape {

    private double a;
    private double b;

    Rectangle(String color, double a, double b){
        super(color);
        this.a=a;
        this.b=b;
    }

    @Override
    public double calcArea() {
        return a*b;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
