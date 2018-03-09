package com.company.lesson2_1.model;

import com.company.lesson2_1.model.entities.Shape;

import java.util.Comparator;

public class ComparatorArea implements Comparator<Shape>{
    @Override
    public int compare(Shape o1, Shape o2) {
       if(o1.calcArea()<o2.calcArea()){
           return -1;
       }else if(o1.calcArea()==o2.calcArea()){
           return 0;
       }else
           return 1;
    }
}
