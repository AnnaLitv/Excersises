package com.company.lesson1.task1;

import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        int numb;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        numb = in.nextInt();
        task1 t1 = new task1();
        int[] mas = t1.toBinary(numb);
        for(int i=mas.length-1;i>=0;i--){
            System.out.print(mas[i]);
        }
        System.out.println("");
        int[] mas1 = t1.toOct(numb);
        for(int i=mas1.length-1;i>=0;i--){
            System.out.print(mas1[i]);
        }
        System.out.println("");
        char[] mas2 = t1.shestSys(numb);
        for(int i=mas2.length-1;i>=0;i--){
            System.out.print(mas2[i]);
        }
    }
}
