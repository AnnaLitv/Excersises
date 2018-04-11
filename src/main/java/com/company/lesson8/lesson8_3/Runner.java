package com.company.lesson8.lesson8_3;

import java.util.Scanner;

public class Runner {


    public void run(){
        Lambda lambda = new Lambda();
        lambda.initalize();
        for (int n:lambda.getMass()) {
            System.out.print(n+" ");
        }
        for (String str:lambda.getListOfStrings()) {
            System.out.print(str+" ");
        }
        lambda.sortAll();
        System.out.println("");
        for (int n:lambda.getMass()) {
            System.out.print(n+" ");
        }
        for (String str:lambda.getListOfStrings()) {
            System.out.print(str+" ");
        }
    }
}

