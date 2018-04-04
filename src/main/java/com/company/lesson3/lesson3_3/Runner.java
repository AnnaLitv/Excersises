package com.company.lesson3.lesson3_3;

public class Runner {
    public void run(){
        System.out.println(EnumExample.valueOf("GREEN").toString());
        System.out.println(EnumExample.valueOf("GREEN").getOrdinal());
        System.out.println(EnumExample.PURPLE.getName());
        System.out.println(EnumExample.PURPLE.getOrdinal());
        System.out.println(EnumExample.RED.equals(EnumExample.RED));
        System.out.println(EnumExample.ORANGE.equals(EnumExample.GREEN));
    }
}
