package com.company.lesson8.lesson8_5;

public class Runner {


    public void run(){
        Lambda lambda = new Lambda();
        lambda.initalize();
        lambda.printAll();
        lambda.sortAll();
        System.out.println("");
        lambda.printAll();
        lambda.workWithMass(x->(x>5)?x:0);
        System.out.println("");
        char c = 's';
        lambda.workWithList(x -> (x.charAt(0)==c)?true:false);
        lambda.printAll();
        lambda.workConvert();
        System.out.println("");
        lambda.printAll();
    }
}

