package com.company.project2.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<Word> words;

    public Sentence() {
    }

    public Sentence(String sentence) {
        this.words = sentenceToWords(sentence);
    }

    private List<Word> sentenceToWords(String sentence) {
        List<Word> resultWords = new ArrayList<>();
        String[] stringWords = sentence.split(Delim.DELIMS_FOR_SENTENCE);
        for (String word: stringWords) {
            resultWords.add(new Word(word));
        }
        return resultWords;
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Word word: words) {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }
}
