package com.company.lesson2.lesson2_1.model;

import com.company.lesson2.lesson2_1.model.entities.Circle;
import com.company.lesson2.lesson2_1.model.entities.Rectangle;
import com.company.lesson2.lesson2_1.model.entities.Shape;
import com.company.lesson2.lesson2_1.model.entities.Triangle;

import java.util.Arrays;

public class ShapesTeam {
    Shape[] shapes;

    public ShapesTeam(){
        shapes=new Shape[13];
        standartInit();
    }

    public double calcAllAreas(){
        double area=0;
        for(Shape shape:shapes){
            area=area+shape.calcArea();
        }
        return area;
    }

    public double calcTypeArea(String type){
        double area=0;
        switch (type){
            case "Triangle":
                for (Shape shape:shapes) {
                    if(shape instanceof Triangle){
                        area=area+shape.calcArea();
                    }
                }
                break;
            case "Rectangle":
                for (Shape shape:shapes) {
                    if(shape instanceof Rectangle){
                        area=area+shape.calcArea();
                    }
                }
                break;
            case "Circle":
                for (Shape shape:shapes) {
                    if(shape instanceof Circle){
                        area=area+shape.calcArea();
                    }
                }
                break;
            default:
                break;
        }
        return area;
    }

//    public void printAreas(){
//        for (Shape shape:shapes) {
//            System.out.println(shape.calcArea());
//        }
//    }
//
//    public void print(){
//        for (Shape shape:shapes) {
//            System.out.println(shape.toString());
//        }
//    }


    public Shape[] sortByArea(){
        ComparatorArea comparatorArea = new ComparatorArea();
        Shape[] shapes1 = new Shape[shapes.length];
        System.arraycopy(shapes,0,shapes1,0,shapes.length);
        Arrays.sort(shapes1,comparatorArea);
        return shapes1;
    }

    public Shape[] sortByColor(){
        ComparatorColor comparatorColor = new ComparatorColor();
        Shape[] shapes1 = new Shape[shapes.length];
        System.arraycopy(shapes,0,shapes1,0,shapes.length);
        Arrays.sort(shapes1,comparatorColor);
        return shapes1;
    }


    public Shape[] getShapes() {
        return shapes;
    }

    private void standartInit(){
        shapes[0]=new Triangle("green",46,67);
        shapes[1]=new Rectangle("red",23,34);
        shapes[2]= new Circle("beige",5.6 );
        shapes[3]=new Circle("darkGreen",9 );
        shapes[4]=new Rectangle("indigo",4,6 );
        shapes[5]=new Triangle("ivory",34,6);
        shapes[6]=new Rectangle("slateGrey",9,8 );
        shapes[7]=new Rectangle("yellowGreen",1,34 );
        shapes[8]=new Circle("white",6 );
        shapes[9]=new Triangle("tan",8,5.6);
        shapes[10]=new Triangle("navy",5,7 );
        shapes[11]=new Circle("purple",4);
        shapes[12]=new Rectangle("orangeRed",3,7);
        for (int i=0;i<shapes.length;i++) {
            shapes[i].setNumb(i);
        }
    }
}
