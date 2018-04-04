package com.company.project2.model.entities;

public class Delim {
    private char[] delims = new char[]{'.','?','!'};

    public Delim() {
    }

    public boolean charIsDelim(char c){
        for (int i = 0; i < delims.length; i++) {
            if (c == delims[i]) {
                return true;
            }
        }
        return false;
    }
}
