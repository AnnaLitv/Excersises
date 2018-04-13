package com.company.project2.model.entities;

public class Sentence {
    private Word[] sentenceMembers = null;

    public Sentence(StringBuffer str){
        if (str.length() != 0) {
            deleteSpaces(str);
            sentenceMembers = new Word[sizeOfSent(str)];
            int lexemeCount = 0;
            int lastLexemeStart = 0;
            StringBuffer word;
            for (int i = 0; i < str.length(); i++) {
                if (charIsDelim(str.charAt(i))) {
                    if (i - lastLexemeStart > 0) {
                        word = new StringBuffer(str.substring(lastLexemeStart, i));
                        sentenceMembers[lexemeCount] = new Word(word);
                        //wods[lexemeCount] = new StringBuffer(word);
                        lexemeCount++;
                    }
                    lastLexemeStart = i + 1;
                } else if (i == str.length() - 1) {
                    word = new StringBuffer(str.substring(lastLexemeStart, i + 1));
                    //wods[lexemeCount] = new StringBuffer(word);
                    sentenceMembers[lexemeCount] = new Word(word);
                }
            }
        }
    }
    void deleteSpaces(StringBuffer str) {
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '\t') {
                str.setCharAt(i, ' ');
            } else if ((str.charAt(i) == ' ' || str.charAt(i) == '\t') && (i + 1 < str.length()) && (str.charAt(i + 1) == ' ' || str.charAt(i + 1) == '\t')) {
                str.deleteCharAt(i);
                i--;
            }
        }
        if (str.charAt(str.length() - 1) == ' ') str.deleteCharAt(str.length() - 1);
    }

    int sizeOfSent(StringBuffer str) {
        int lexemeCount = 0;
        int lastLexemeStart = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charIsDelim(str.charAt(i))) {
                if (i - lastLexemeStart > 0) {
                    lexemeCount++;
                }
                lastLexemeStart = i + 1;
            } else if (i == str.length() - 1) {
                lexemeCount++;
            }
        }
        return lexemeCount;
    }

    private boolean charIsDelim(char c) {
        char[] delimiters = new char[]{'.', ',', ' ', '?', '!', '-', '\t', '\n', '\r'};
        for (int i = 0; i < delimiters.length; i++) {
            if (c == delimiters[i]) {
                return true;
            }
        }
        return false;
    }
}
