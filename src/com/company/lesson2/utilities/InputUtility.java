package com.company.lesson2.utilities;

import java.util.Scanner;

public class InputUtility {

    Scanner in ;
    public InputUtility(){
        in = new Scanner(System.in);
    }

    public String enterDiagnos(){
        String str = in.nextLine();
        return str;
    }

    public int enterInt(){
        int n = in.nextInt();
        in.nextLine();
        return n;
    }
}
