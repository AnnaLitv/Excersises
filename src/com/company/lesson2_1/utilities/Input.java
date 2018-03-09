package com.company.lesson2_1.utilities;

import java.util.Scanner;

public class Input {

    public static String enterType(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int enterInt(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        return n;
    }
}
