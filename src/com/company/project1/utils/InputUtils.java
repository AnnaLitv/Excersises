package com.company.project1.utils;

import com.company.project1.view.Viewer;

import java.util.Scanner;

public class InputUtils {
    static Scanner in = new Scanner(System.in);

    public static int enterInt(){
        int n = 0;
        while (!in.hasNextInt()) {
            System.out.println(Viewer.INP_ERROR);
            in.nextLine();
        }
        n = in.nextInt();
        in.nextLine();
        return n;
    }
}
