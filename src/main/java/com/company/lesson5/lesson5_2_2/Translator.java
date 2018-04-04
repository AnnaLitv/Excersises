package com.company.lesson5.lesson5_2_2;

import java.util.HashMap;

public class Translator {
    HashMap<String, String> dictionary;
    String[] mas;
    String trans;


    public Translator(){
        dictionary = new HashMap<>();
    }

    public void addPair(String eng, String rus){
        dictionary.put(eng,rus);
    }

    public void initDictionary(){
        addPair("no","нет");
        addPair("i","я");
        addPair("worked","работал");
        addPair("in","в");
        addPair("dairy","молочный");
        addPair("queen","королева");
    }

    public void parseString(String str){
        str=str.toLowerCase();
        mas=(str+" ").split("\\p{P}?[ \\t\\n\\r]+");
        for (String s:mas) {
            System.out.println(s);
        }
    }

    public String translate(){
        StringBuffer sb = new StringBuffer();
        for(String s:mas){
            sb.append(dictionary.get(s)+" ");
        }
        return sb.toString();
    }
}
