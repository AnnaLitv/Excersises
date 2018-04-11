package com.company.lesson8.lesson8_5;

import java.util.*;

public class Lambda {
    private Integer[] mass ;
    private List<String> listOfStrings;

    interface myFunc1{
        int massT(int n);
    }
    interface myFunc2{
        boolean listT(String str);
    }

    public Lambda() {
        mass=new Integer[20];
        listOfStrings = new ArrayList<>();
    }

    public void sortAll(){
        Collections.sort(listOfStrings,(s1,s2)->s1.compareTo(s2)*(-1));
        Arrays.sort(mass, Comparator.reverseOrder());
    }

    public void workWithMass(myFunc1 func){
        for(int i=0;i<mass.length;i++){
            mass[i]=func.massT(mass[i]);
        }
    }
    public void workWithList(myFunc2 func2){
        for(int i=0;i<listOfStrings.size();i++){
            if(func2.listT(listOfStrings.get(i))){
                listOfStrings.set(i,listOfStrings.get(i).toUpperCase());
            }
        }
    }

    public void workConvert(){
        Consumer<String> con = s -> s.toUpperCase();
        for(int i=0;i<listOfStrings.size();i++){
            if(con.isAlive(listOfStrings.get(i))){
                listOfStrings.set(i,con.convert(listOfStrings.get(i)));
            }
        }
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

    public void printAll(){
        for (int n:mass) {
            System.out.print(n+" ");
        }
        for (String str:listOfStrings) {
            System.out.print(str+" ");
        }
    }
}
