package com.company.lesson2.lesson2_1.model.entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void calcArea() throws Exception {
        Shape shape = new Rectangle("red",4,5);
        Shape shape1 = new Circle("orange",5);
        Shape shape2 = new Triangle("yellow",4,6);
        assertEquals(20,shape.calcArea(),0.1);
        assertEquals(78.54,shape1.calcArea(),0.001);
        assertEquals(12,shape2.calcArea(),0.1);
    }

    @Test
    public void toString1() throws Exception {
        Shape shape = new Rectangle("red",4,5);
        shape.setNumb(0);
        assertEquals("0 I'm Rectangle: a = 4.0 b = 5.0 and I'm red area = 20.0",shape.toString());
    }

    @Test
    public void getNumb() throws Exception {
        Shape shape = new Rectangle("red",4,5);
        shape.setNumb(0);
        assertEquals(0,shape.getNumb());
    }

}