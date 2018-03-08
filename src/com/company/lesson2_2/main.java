package com.company.lesson2_2;

import com.company.lesson2_2.controller.Controller;
import com.company.lesson2_2.model.ActionWithPatient;
import com.company.lesson2_2.view.Viewer;

public class main {
    public static void main(String[] args){
        Viewer viewer = new Viewer();
        ActionWithPatient actionWithPatient = new ActionWithPatient();
        Controller r = new Controller(viewer,actionWithPatient);
        r.run();
    }
}
