package com.company.lesson2.lesson2_2.utilities;

import java.util.Scanner;

public class InputUtility {

    static Scanner in ;
    public  InputUtility(){
        in = new Scanner(System.in);
    }

    public static String enterDiagnos(){
        return in.nextLine();
    }

    public static int enterInt(){
        int n = in.nextInt();
        in.nextLine();
        return n;
    }
}
