package com.company.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private void menu(){
        System.out.println("**********************Menu************************");
        System.out.println("1.Получить список пациентов, которые имеют указанный диагноз;");
        System.out.println("2.Получить список пациентов, у которых номер медицинской карточки находится в заданном диапазоне;");
        System.out.println("3.Упорядочить пациентов в алфавитном порядке согласно фамилии");
        System.out.println("4.Отобразить список пациентов");
        System.out.println("5.EXIT");
        System.out.println("**************************************************");
    }
    public void run(){
        ActionWithPatient actionWithPatient = new ActionWithPatient();
       int c = 0;
        Scanner in = new Scanner(System.in);
        menu();
        c = in.nextInt();
        actionWithPatient.fillStandart();
       while(c!=5){
            switch (c){
                case 1:
                    System.out.println("Введите диагноз: ");
                    String diagnos="";
                    in.nextLine();
                    diagnos =  in.nextLine();
                    ArrayList<Patient> patients =actionWithPatient.diagnosCheck(diagnos);
                    if(patients!=null){
                        for (Patient p:patients) {
                            System.out.println(p.toString());
                        }
                    }else {
                        System.out.println("Нет пациэнтов в этой категории");
                    }
                    break;
                case 2:
                    System.out.println("Введите начало диапазона: ");
                    int start = in.nextInt();
                    System.out.println("Введите конец диапазона: ");
                    int end = in.nextInt();
                    ArrayList<Patient> patients1 = actionWithPatient.getPatientsFromDiapason(start,end);
                    if(patients1!=null){
                        for (Patient p:patients1) {
                            System.out.println(p.toString());
                        }
                    }else {
                        System.out.println("Нет пациэнтов в этом диапазоне");
                    }
                    break;
                case 3:
                    List<Patient> patients3 = actionWithPatient.sortPatients();
                    for (Patient p:patients3) {
                        System.out.println(p.toString());
                    }
                    break;
                case 4:
                    ArrayList<Patient> patients2 = actionWithPatient.getPatients();
                    for (Patient p:patients2) {
                        System.out.println(p.toString());
                    }
                    break;
                default:
                    break;
            }
            menu();
            c = in.nextInt();
       }
    }
}
