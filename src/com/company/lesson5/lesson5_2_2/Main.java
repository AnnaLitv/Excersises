package com.company.lesson5.lesson5_2_2;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        translator.initDictionary();
        translator.parseString("No, I worked in Dairy Queen.");
        System.out.println(translator.translate());
    }
}
