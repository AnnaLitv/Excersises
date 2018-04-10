package com.company.lesson8.lesson8_1.view;

import com.company.lesson7.model.entities.Patient;

import java.util.List;

public class Viewer {
    public static String MENU ="**********************Menu************************\n"+
            "1.Строка по умолчанию\n"+
            "2.Ввести строку\n"+
            "3.Поменять строку\n"+
            "4.Показать строку\n"+
            "5.EXIT\n"+
            "**************************************************";
    public static final String INPUT_STRING = "Введите строку:";
    public static final String INPUT_REPLACE_STRING = "Введите строку для замены:";
    public static final String ERROR = "Ошибка!";
    public Viewer(){ }

    public static void menuOutput(){
        System.out.println(MENU);
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
