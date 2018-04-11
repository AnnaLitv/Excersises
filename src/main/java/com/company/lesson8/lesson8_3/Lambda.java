package com.company.lesson8.lesson8_3;

import java.util.*;

public class Lambda {
    private Integer[] mass ;
    private List<String> listOfStrings;

    public Lambda() {
        mass=new Integer[20];
        listOfStrings = new ArrayList<>();
    }

    public void sortAll(){
        Collections.sort(listOfStrings,(s1,s2)->s1.compareTo(s2)*(-1));
        Arrays.sort(mass, Comparator.reverseOrder());
    }

    public void initalize(){
        for (int i=0;i<mass.length;i++) {
            mass[i]=(int)(Math.random()*10+1);
        }
        listOfStrings.add("sdfghujik");
        listOfStrings.add("awsedcfvgbnj");
        listOfStrings.add("hujweifrgbwnjqaw");
        listOfStrings.add("ppwqiegwhbcjnc");
        listOfStrings.add("qtcxqdvwde");
        listOfStrings.add("pqvoemitnegmntbf");
        listOfStrings.add("cewqsrdrweyr");
    }

    public Integer[] getMass() {
        return mass;
    }

    public List<String> getListOfStrings() {
        return listOfStrings;
    }
}
