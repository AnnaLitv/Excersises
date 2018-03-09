package com.company.lesson2_1;

import com.company.lesson2_1.controller.Controller;
import com.company.lesson2_1.model.ShapesTeam;
import com.company.lesson2_1.view.Viewer;

public class main {
    public static void main(String[] args){
        Viewer viewer = new Viewer();
        ShapesTeam shapesTeam = new ShapesTeam();
        Controller controller = new Controller(viewer,shapesTeam);
        controller.control();
    }
}
