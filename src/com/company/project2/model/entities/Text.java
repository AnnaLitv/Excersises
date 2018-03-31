package com.company.project2.model.entities;

import java.util.ArrayList;

public class Text {
    private ArrayList<Sentence> sentences;

    public Text(String text){
        if(text!=null){
            makeSentences(text);
        }
    }

    private void makeSentences(String text){
        text=deleteSpaces(text);
        if(text.length()!=0){
            for (){

            }
        }
    }

    private String deleteSpaces(String text){
        StringBuilder stringBuilder = new StringBuilder(text);
        for(int i=0;i<stringBuilder.length();i++){
            if(stringBuilder.charAt(i)=='\t'){
                stringBuilder.setCharAt(i,' ');
            }else if((stringBuilder.charAt(i) == ' ' || stringBuilder.charAt(i) == '\t') && (i + 1 < stringBuilder.length())
                    && (stringBuilder.charAt(i + 1) == ' ' || stringBuilder.charAt(i + 1) == '\t')){
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == ' ') {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }
}
