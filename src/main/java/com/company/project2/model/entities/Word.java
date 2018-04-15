package com.company.project2.model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Word {

    private List<Letter> letters;

    public Word(String word) {
        this.letters = wordToLetters(word);
    }

    private List<Letter> wordToLetters(String word) {
        List<Letter> resultLetters = new ArrayList<>();
        char[] charLetters = word.toCharArray();
        for (char letter: charLetters) {
            resultLetters.add(new Letter(letter));
        }
        return resultLetters;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Letter letter: letters)
            stringBuilder.append(letter.getLetter());
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(letters, word.letters);
    }
}
