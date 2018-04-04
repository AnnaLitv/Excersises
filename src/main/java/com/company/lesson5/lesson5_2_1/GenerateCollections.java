package com.company.lesson5.lesson5_2_1;

import java.util.*;

public class GenerateCollections {
    List<Integer> list;
    Set<Integer> sets;

    public GenerateCollections(){
        list = new ArrayList<>();
        sets = new TreeSet<>();
    }

    public void generateLists(int numb, int start, int end){
        for(int i=0;i<numb;i++){
            list.add((int)(Math.random()*end+start));
        }
    }

    public void generateSets(int numb, int start, int end){
        for(int i=0;i<numb;i++){
            int temp = (int)(Math.random()*end+start);
            if(!list.add(temp) ){
                System.out.println("List cant add this numb "+temp);
            }
            if(!sets.add(temp)){
                System.out.println("Set cant add this numb "+temp);
            }
        }
    }

    public void printCollections(){
        printCollection(list);
        System.out.println("");
        printCollection(sets);
        System.out.println("");
    }

    private void printCollection(Collection col){
        for (Object co: col) {
            System.out.print(co);
        }
    }

}
