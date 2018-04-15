package com.company.lesson9.lesson9_2;

public class Runner {
    public void run(){
        Runnable Counter = ()->{

        };
        Runnable Printer = () -> {

        };
        new Thread(Counter).start();
        new Thread(Printer).start();
    }
}
