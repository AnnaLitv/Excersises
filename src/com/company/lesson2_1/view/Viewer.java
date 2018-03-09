package com.company.lesson2_1.view;

import com.company.lesson2_1.model.entities.Shape;

public class Viewer {
    public static String MENU ="**********************Menu************************\n"+
            "1.Отобразить все фигуры в массиве\n"+
            "2.Отобразить площадь всех фигур в массиве\n"+
            "3.Отобразить площадь фигур конкретного типа\n"+
            "4.Сортировать массив фигур по площади\n"+
            "5.Сортировать массив фигур по цвету\n"+
            "6.EXIT\n"+
            "**************************************************";
    public static String ENTER_TYPE="Введите тип фигур:";
    public static String ENTER_NUMBER="Введите номер фигуры:";

    public Viewer(){}

    public void menuOutput(){
        System.out.println(MENU);
    }

    public void MasOutput(Shape[] shapes){
        for (int i=0;i<shapes.length;i++) {
            shapes[i].draw();
        }
    }

    public void NumbOutput(double numb){
        System.out.println(numb);
    }

    public void MessageOutput(String message){
        System.out.println(message);
    }

}
