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

        return Math.round(a*b*100.0)/100.0;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.a, a) != 0) return false;
        return Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
