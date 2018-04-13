package com.company.lesson9.lesson9_1;

public class Runner {
    public void run(){
        Runnable task = ()->{
            for(int i=10;i>=0;i--){
                System.out.println(i);
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Bang!");
        };
        new Thread(task).start();
    }
}
