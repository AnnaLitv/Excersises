package com.company.project2.model.entities;

import java.util.ArrayList;

public class Text {
    private Sentence[] sentences = null;

    public Text(StringBuilder text){
        if(text!=null){
            makeSentences(text);
        }
    }

    private void makeSentences(StringBuilder text){
        int start = 0;
        int num = 0;
        Delim del = new Delim();
        if (!del.charIsDelim(text.charAt(text.length() - 1))) {
            text.append('.');
        }
        text=deleteSpaces(text);
        if(text.length()!=0){
            for (int i=0;i<text.length();i++){
                if(del.charIsDelim(text.charAt(i))){
                    sentences[num] = new Sentence(new StringBuilder(text.substring(start, i)));
                    if (i < text.length() - 2 && text.charAt(i + 1) == ' ') {
                        start = i + 2;
                    } else
                        start = i + 1;
                    num++;
                }
            }
        }
    }

    private StringBuilder deleteSpaces(StringBuilder text){
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
        return stringBuilder;
    }
}
