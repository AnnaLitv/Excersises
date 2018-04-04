package com.company.lesson2.lesson2_1.model.entities;


import java.text.DecimalFormat;

public class Circle extends Shape {

    private double radi;
    private final double pi = Math.PI;

    public Circle(String color, double radi){
        super(color);
        this.radi=radi;
    }

    @Override
    public double calcArea() {
        return Math.round(pi*Math.pow(radi,2)*100.0)/100.0;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return getNumb()+" I'm Circle:" +
                " radi = "+radi+super.toString()+" area = "+calcArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radi, radi) != 0) return false;
        return Double.compare(circle.pi, pi) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(radi);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(pi);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
