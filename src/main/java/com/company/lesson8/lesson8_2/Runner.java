package com.company.lesson8.lesson8_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Runner {
    private String MENU ="**********************Menu************************\n"+
            "1.Вывести число\n"+
            "2.Инкремент\n"+
            "3.Декремент\n"+
            "4.Поменять знак\n"+
            "5.EXIT\n"+
            "**************************************************";
    private Scanner in =new Scanner(System.in);
    private UniMathOperation obj;
    public void run(){
        createNumberReflection();
        int c = 0;
        System.out.println(MENU);
        c = enterInt();
        while(c!=5){
            switch (c){
                case 1:
                    Class<?> claz = obj.getClass();
                    try {
                        Field value = claz.getDeclaredField("number");
                        value.setAccessible(true);
                        System.out.println(value.getDouble(obj));
                    } catch (NoSuchFieldException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    claz = obj.getClass();
                    try {
                        Method method = claz.getMethod("increment");
                        method.invoke(obj);
                    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    claz = obj.getClass();
                    try {
                        Method method = claz.getMethod("decrement");
                        method.invoke(obj);
                    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    claz = obj.getClass();
                    try {
                        Method method = claz.getMethod("changeSign");
                        method.invoke(obj);
                    } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
            }
            System.out.println(MENU);
            c = enterInt();
        }
    }
    private void createNumberReflection(){
        try {
            Class<?> clas1 = UniMathOperation.class;
            Class<?>[] typeParam = new Class<?>[]{double.class};
            Constructor constructors = clas1.getConstructor(typeParam);
            obj = (UniMathOperation)constructors.newInstance(3.9);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
    private int enterInt(){
        int n = in.nextInt();
        in.nextLine();
        return n;
    }
}
