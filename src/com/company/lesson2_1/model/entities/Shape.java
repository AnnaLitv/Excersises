package com.company.lesson2_1.model.entities;

import com.company.lesson2_1.model.entities.Drawable;

public abstract class Shape implements Drawable {
    public String shapeColor;

    Shape(){
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return super.toString();
    }
}
