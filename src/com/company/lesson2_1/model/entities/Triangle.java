package com.company.lesson2_1.model.entities;

import com.company.lesson2_1.model.entities.Shape;

public class Triangle extends Shape {

    private double a;
    private double h;

    Triangle(String color, double a, double h){
        super(color);
        this.a=a;
        this.h=h;
    }

    @Override
    public double calcArea() {
        return 0.5*a*h;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeColor='" + shapeColor + '\'' +
                '}';
    }
}
