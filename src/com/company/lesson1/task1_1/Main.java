package com.company.lesson1.task1_1;
//package com.company.lesson1.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numb;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        numb = in.nextInt();
        t1 t = new t1();
        String str = t.dvoichSys(numb);
            System.out.println(str);
        System.out.println(t.vosmSys(numb));
        System.out.println(t.shestSys(numb));
    }
}
