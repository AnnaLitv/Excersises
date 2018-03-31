package com.company.project1.utils;

import java.util.Scanner;

public class InputUtils {
    static Scanner in = new Scanner(System.in);

    public static String enterString(){
        return in.nextLine();
    }

    public static int enterInt(){
        int n = in.nextInt();
        in.nextLine();
        return n;
    }
}
