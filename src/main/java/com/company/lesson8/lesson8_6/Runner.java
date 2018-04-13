package com.company.lesson8.lesson8_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run(){
        Stream<Integer> genStream = Stream.iterate(10,n -> n+10).limit(10).map(n->n/2);
        List<Integer> numbers = genStream.collect(Collectors.toList());
        for (Integer n:numbers) {
            System.out.print(n+" ");
        }
        List<Person> people = peopleGenerate();
        List<Person> manAfter20 = people.stream().filter(n -> ((n.getAge()>20)&&(!n.isSex())&&(n.getAge()<=60))).collect(Collectors.toList());
        System.out.println("");
        printPeople(manAfter20);
        double women = people.stream().filter(n->n.isSex()).mapToDouble(n->n.getAge()).sum()/people.stream().filter(n->n.isSex()).count();
        System.out.println(women);
    }

    private List<Person> peopleGenerate(){
        List<Person> rand = new ArrayList<>();
        rand.add(new Person("Olga",20,true));
        rand.add(new Person("Maria",34,true));
        rand.add(new Person("Polina",10,true));
        rand.add(new Person("Viktoria",19,true));
        rand.add(new Person("Makar",23,false));
        rand.add(new Person("Marpha",60,true));
        rand.add(new Person("Petro",4,false));
        rand.add(new Person("Alex",40,false));
        rand.add(new Person("Iliia",20,false));
        rand.add(new Person("Oleg",10,false));
        rand.add(new Person("Lisa",20,true));
        rand.add(new Person("Ostap",90,false));
        return rand;
    }

    private void printPeople(List<Person> list){
        for (Person p:list) {
            System.out.println(p);
        }
    }
}
