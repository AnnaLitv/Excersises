package com.company.lesson2.lesson2_1.model.entities;

public class Triangle extends Shape {

    private double a;
    private double h;

    public Triangle(String color, double a, double h){
        super(color);
        this.a=a;
        this.h=h;
    }

    @Override
    public double calcArea() {

        return Math.round(0.5*a*h*100.0)/100.0;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return getNumb()+" I'm Triangle:" +
                " a = "+a+" h = "+h+super.toString()+" area = "+calcArea();
    }
    public int getNumb(){
        return this.numb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.a, a) != 0) return false;
        return Double.compare(triangle.h, h) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
