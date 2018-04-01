package com.company.project1.view;

import com.company.project1.model.entities.Plane;

import java.util.List;

public class Viewer {
    public static String MENU ="**********************Menu************************\n"+
            "1.Инициализировать стандартно\n"+
            "2.Вывести список самолетов авиакомпании\n"+
            "3.Упорядочить самолеты по дальности полета\n"+
            "4.Посчитать общую вместимость и грузоподьемность\n"+
            "5.Найти самолеты по потреблению горючего\n"+
            "6.EXIT\n"+
            "**************************************************";
    public static String INPUT_START_DIAPASON = "Введите начало диапазона(потребление горючего):";
    public static String INPUT_END_DIAPASON = "Введите конец диапазона(потребление горючего):";
    public static String NULL_LIST="Нет самолетов по данному запросу!";
    public static String GENERAL_CAPACITY="Общая вместимость:";
    public static String INP_ERROR="Ошибка! Введите число!";
    public static String GENERAL_CARRYING="Общая грузоподьемность:";

    public Viewer(){ }

    //вывод меню на экран
    public static void menuOutput(){
        System.out.println(MENU);
    }

    //вывод списка самолетов
    public void ArrayOutput(List<Plane> list){
        for (Plane p: list) {
            System.out.println(p.toString());
        }
    }

    //вывод сообщения на экран
    public void showMessage(String message){
        System.out.println(message);
    }

    //вывод числа на экран
    public void showInt(int n){
        System.out.println(n);
    }
}
