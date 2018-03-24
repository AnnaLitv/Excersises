package com.company.lesson5.lesson5_2_1;

import java.util.*;

public class GenerateCollections {
    List<List<Integer>> lists;
    List<Set<Integer>> sets;

    public GenerateCollections(){
        lists = new ArrayList<>();
        sets = new ArrayList<>();
    }

    public void generateLists(int numb){
        for(int i=0;i<numb;i++){
            ArrayList<Integer> temp= new ArrayList<>();
            temp.add(i);
            lists.add(temp);
        }
    }

    public void generateSets(int numb){
        for(int i=0;i<numb;i++){
            Set<Integer> temp= new TreeSet<>();
            temp.add(i);
            sets.add(temp);
        }
    }

    public void printCollections(){
        printCollection(lists);
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
