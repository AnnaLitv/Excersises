package com.company.lesson5.lesson5_1.view;

import java.util.List;

public class View {

    public static String MENU ="**********************Menu************************\n"+
            "1.Отобразить все записи в журнале\n"+
            "2.Ввести нового студента в журнал\n"+
            "3.EXIT\n"+
            "**************************************************";

    public static String ENTER_NAME="Введите имя студента";
    public static String ENTER_LAST_NAME="Введите фамилию студента";
    public static String ENTER_DATE="Введите дату рождения YYYY-MM-DD";
    public static String ENTER_PHONE="Введите телефон +38(XXX)XXX-XX-XX";
    public static String ENTER_ADDRESS="Введите адрес ";
    public static String REENTER="ВВЕДИТЕ ПОЛЕ ЗАНОВО!!!";

    public View() {
    }

    public void menuOutput(){
        System.out.println(MENU);
    }


    public void ListOutput(List list){
        if (list.size()==0){
            System.out.println("Тут еще ничего нет!");
        }else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public void NumbOutput(double numb){
        System.out.println(numb);
    }

    public void MessageOutput(String message){
        System.out.println(message);
    }
}
