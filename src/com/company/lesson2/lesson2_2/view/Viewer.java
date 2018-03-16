package com.company.lesson2.lesson2_2.view;

import com.company.lesson2.lesson2_2.model.entities.Patient;

import java.util.List;

public class Viewer {
    public static String MENU ="**********************Menu************************\n"+
            "1.Получить список пациентов, которые имеют указанный диагноз\n"+
            "2.Получить список пациентов, у которых номер медицинской карточки находится в заданном диапазоне\n"+
            "3.Упорядочить пациентов в алфавитном порядке согласно фамилии\n"+
            "4.Отобразить список пациентов\n"+
            "5.EXIT\n"+
            "**************************************************";
    public static String INPUT_START_DIAPASON = "Введите начало диапазона(номер медкарты):";
    public static String INPUT_END_DIAPASON = "Введите конец диапазона(номер медкарты):";
    public static String INPUT_DIAGNOS = "Введите диагноз:";

    public Viewer(){ }
    public static void menuOutput(){
        System.out.println(MENU);
    }
    public void ArrayOutput(List<Patient> list){
        for (Patient p: list) {
            System.out.println(p.toString());
        }
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
