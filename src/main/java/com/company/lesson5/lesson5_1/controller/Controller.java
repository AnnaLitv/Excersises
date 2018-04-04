package com.company.lesson5.lesson5_1.controller;

import com.company.lesson5.lesson5_1.model.Model;
import com.company.lesson5.lesson5_1.model.entities.NoteInJournal;
import com.company.lesson5.lesson5_1.utilities.Input;
import com.company.lesson5.lesson5_1.view.View;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model){
        this.model=model;
        this.view=view;
    }

    public void control(){
        int c = 0;
        view.menuOutput();
        c = Input.enterInt();
        while(c!=3){
            switch (c){
                case 1:
                    view.ListOutput(model.getStudents());
                    break;
                case 2:
                    NoteInJournal note = new NoteInJournal();
                    String pName = "([A-Z]{1})([a-z]*)";
                    String phone = "^\\+([1-9]{2})\\([0-9]{3}\\)[0-9]{3}\\-[0-9]{2}\\-[0-9]{2}$";
                    String date = "^((19|18|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
                    String address = "^([A-Z]{1})([a-zA-Z ]*)\\,([1-9]{1,3})\\,([1-9]{1,3})$";
                    view.MessageOutput(View.ENTER_NAME);
                    note.setFirstName(inputWhile(pName));
                    view.MessageOutput(View.ENTER_LAST_NAME);
                    note.setLastName(inputWhile(pName));
                    view.MessageOutput(View.ENTER_PHONE);
                    note.setPhone(inputWhile(phone));
                    view.MessageOutput(View.ENTER_DATE);
                    note.setDateOfBirth(inputWhile(date));
                    view.MessageOutput(View.ENTER_ADDRESS);
                    note.setAddress(inputWhile(address));
                    model.add(note);
                    break;
                default:
                    break;
            }
            view.menuOutput();
            c = Input.enterInt();
        }
    }

    private String inputWhile(String pat){
        boolean flag = false;
        while (!flag){
            String str = Input.enterString();
            if(model.checkPattern(str,pat)){
                return str;
            }
            view.MessageOutput(View.REENTER);
        }
        return null;
    }
}
