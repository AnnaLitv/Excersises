package com.company.lesson5.lesson5_1.utilities;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

    public static String enterString(){
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
