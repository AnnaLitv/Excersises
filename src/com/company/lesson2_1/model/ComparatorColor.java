package com.company.lesson2_1.model;

import com.company.lesson2_1.model.entities.Shape;

import java.util.Comparator;

public class ComparatorColor implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.shapeColor.compareTo(o2.shapeColor);
    }
}
