package com.company.lesson2_1.model.entities;

import com.company.lesson2_1.model.entities.Drawable;

public abstract class Shape implements Drawable {
    public String shapeColor;
    int numb;

    Shape(String shapeColor){
        this.shapeColor=shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return " and I'm "+shapeColor;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
}
