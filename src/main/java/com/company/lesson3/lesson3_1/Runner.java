package com.company.lesson3.lesson3_1;

import java.util.ArrayList;

public class Runner {
    Store store;

    Runner(){
        store = new Store();
    }

    public void run(){
        initalizeStandart();
        store.print();
        System.out.println("");
        store.sortByFloor();
        store.print();
        store.addGoods("Silpo","Milk");
        System.out.println("");
        store.print();
        //store.deleteDepartment("Adidas");
        //store.print();
    }

    private void initalizeStandart(){
        ArrayList<String> services1 = new ArrayList<>();
        services1.add("Buy clothes");
        services1.add("Make selfie with clothes");
        store.addDepartment("Adidas","clothes",services1,2);
        store.addGoods("Adidas","Adidas ZX");
        store.addGoods("Adidas","Adidas TopMan");
        ArrayList<String> services2 = new ArrayList<>();
        services2.add("Buy food");
        services2.add("Take away");
        store.addDepartment("Silpo","food",services2,1);
        store.addGoods("Silpo","Salmon");
        store.addGoods("Silpo","Lays");
        ArrayList<String> services3 = new ArrayList<>();
        services3.add("Wedding jewelery");
        services3.add("Fix damaged jewlry");
        store.addDepartment("GoldStar","jwlr",services3,4);
        store.addGoods("GoldStar","Heart");
        store.addGoods("GoldStar","Golden ring");
    }
}
