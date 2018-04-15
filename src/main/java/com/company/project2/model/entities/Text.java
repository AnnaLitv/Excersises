package com.company.project2.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    public Text() {
    }

    public Text(String text) {
        this.sentences = textToSentences(text);
    }

    private List<Sentence> textToSentences(String text) {
        String textTemp = deleteSpaces(text.toLowerCase());
        List<Sentence> sentencesFinal = new ArrayList<>();
        String[] splitSentences = textTemp.split(Delim.DELIMS_FOR_TEXT);
        for (String str: splitSentences) {
            sentencesFinal.add(new Sentence(str.trim()));
        }
        return sentencesFinal;
    }

    private String deleteSpaces(String text) {
        return text.replaceAll("\\s{2,}", " ").trim();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Sentence sentence: sentences) {
            stringBuilder.append(sentence.toString());
            stringBuilder.append(". ");
        }
        return stringBuilder.toString();
    }


    public List<Sentence> getSentences() {
        return sentences;
    }
}
