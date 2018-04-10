package com.company.lesson7.utilities;

import java.util.Scanner;

public class InputUtility {

    static Scanner in ;
    public InputUtility(){
        in = new Scanner(System.in);
    }

    public static String enterString(){
        return in.nextLine();
    }

    public static int enterInt(){
        int n = in.nextInt();
        in.nextLine();
        return n;
    }
}
