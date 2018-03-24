package com.company.lesson2.lesson2_1.model;

import com.company.lesson2.lesson2_1.model.entities.Circle;
import com.company.lesson2.lesson2_1.model.entities.Rectangle;
import com.company.lesson2.lesson2_1.model.entities.Shape;
import com.company.lesson2.lesson2_1.model.entities.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShapesTeamTest {
    @Test
    public void calcAllAreas() throws Exception {
        ShapesTeam shapesTeam = new ShapesTeam();
        double res =  shapesTeam.calcAllAreas();
        assertEquals(3132.25,res,0.01);
    }

    @Test
    public void calcTypeArea() throws Exception {
        ShapesTeam shapesTeam = new ShapesTeam();
        String name = "Triangle";
        double res = shapesTeam.calcTypeArea(name);
        assertEquals(1682.9,res,0.01);
        name="Rectangle";
        res=shapesTeam.calcTypeArea(name);
        assertEquals(933,res,0.1);
        name="Circle";
        res=shapesTeam.calcTypeArea(name);
        assertEquals(516.35,res,0.01);
    }

    @Test
    public void sortByArea() throws Exception {
        ShapesTeam shapesTeam = new ShapesTeam();
        Shape[] shapes = new Shape[13];
        shapes[0]=new Triangle("navy",5,7 );
        shapes[0].setNumb(10);
        shapes[1]=new Rectangle("orangeRed",3,7);
        shapes[1].setNumb(12);
        shapes[2]=new Triangle("tan",8,5.6);
        shapes[2].setNumb(9);
        shapes[3]=new Rectangle("indigo",4,6 );
        shapes[3].setNumb(4);
        shapes[4]=new Rectangle("yellowGreen",1,34 );
        shapes[4].setNumb(7);
        shapes[5]=new Circle("purple",4);
        shapes[5].setNumb(11);
        shapes[6]=new Rectangle("slateGrey",9,8 );
        shapes[6].setNumb(6);
        shapes[7]=new Circle("beige",5.6 );
        shapes[7].setNumb(2);
        shapes[8]=new Triangle("ivory",34,6);
        shapes[8].setNumb(5);
        shapes[9]=new Circle("white",6 );
        shapes[9].setNumb(8);
        shapes[10]=new Circle("darkGreen",9 );
        shapes[10].setNumb(3);
        shapes[11]=new Rectangle("red",23,34);
        shapes[11].setNumb(1);
        shapes[12]=new Triangle("green",46,67);
        shapes[12].setNumb(0);
        assertArrayEquals(shapes,shapesTeam.sortByArea());
    }

    @Test
    public void sortByColor() throws Exception {
        ShapesTeam shapesTeam = new ShapesTeam();
        Shape[] shapes=new Shape[13];
        shapes[0]=new Circle("beige",5.6 );
        shapes[0].setNumb(2);
        shapes[1]=new Circle("darkGreen",9 );
        shapes[1].setNumb(3);
        shapes[2]=new Triangle("green",46,67);
        shapes[2].setNumb(0);
        shapes[3]=new Rectangle("indigo",4,6 );
        shapes[3].setNumb(4);
        shapes[4]=new Triangle("ivory",34,6);
        shapes[4].setNumb(5);
        shapes[5]=new Triangle("navy",5,7 );
        shapes[5].setNumb(10);
        shapes[6]=new Rectangle("orangeRed",3,7);
        shapes[6].setNumb(12);
        shapes[7]=new Circle("purple",4);
        shapes[7].setNumb(11);
        shapes[8]=new Rectangle("red",23,34);
        shapes[8].setNumb(1);
        shapes[9]=new Rectangle("slateGrey",9,8 );
        shapes[9].setNumb(6);
        shapes[10]=new Triangle("tan",8,5.6);
        shapes[10].setNumb(9);
        shapes[11]=new Circle("white",6 );
        shapes[11].setNumb(8);
        shapes[12]=new Rectangle("yellowGreen",1,34 );
        shapes[12].setNumb(7);
        assertArrayEquals(shapes,shapesTeam.sortByColor());
    }

}