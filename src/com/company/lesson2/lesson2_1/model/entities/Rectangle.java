package com.company.lesson2.lesson2_1.model.entities;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(String color, double a, double b){
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
        return getNumb()+" I'm Rectangle:" +
                " a = "+a+" b = "+b+super.toString()+" area = "+calcArea();
    }
    public int getNumb(){
        return this.numb;
    }
}
