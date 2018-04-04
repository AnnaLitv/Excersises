package com.company.lesson5.lesson5_1.model;

import com.company.lesson5.lesson5_1.model.entities.NoteInJournal;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {

    List<NoteInJournal> students ;

    public Model() {
        this.students = new ArrayList<>();
    }

    public List<NoteInJournal> getStudents() {
        return students;
    }

    public void add(NoteInJournal note){
        students.add(note);
    }

    public boolean checkPattern(String str, String pattern){
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
