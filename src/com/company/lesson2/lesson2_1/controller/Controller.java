package com.company.lesson2.lesson2_1.controller;

import com.company.lesson2.lesson2_1.model.ShapesTeam;
import com.company.lesson2.lesson2_1.utilities.Input;
import com.company.lesson2.lesson2_1.view.Viewer;

public class Controller {
    private Viewer viewer;
    private ShapesTeam shapesTeam;

    public Controller(Viewer viewer, ShapesTeam shapesTeam){
        this.viewer=viewer;
        this.shapesTeam=shapesTeam;
    }

    public void control(){
        int c = 0;
        viewer.menuOutput();
        c = Input.enterInt();
        while(c!=6){
            switch (c){
                case 1:
                    viewer.MasOutput(shapesTeam.getShapes());
                    break;
                case 2:
                    viewer.NumbOutput(shapesTeam.calcAllAreas());
                   break;
                case 3:
                    viewer.MessageOutput(viewer.ENTER_TYPE);
                    viewer.NumbOutput(shapesTeam.calcTypeArea(Input.enterType()));
                    break;
                case 4:
                    viewer.MasOutput(shapesTeam.sortByArea());
                    break;
                case 5:
                    viewer.MasOutput(shapesTeam.sortByColor());
                    break;
                default:
                    break;
            }
            viewer.menuOutput();
            c = Input.enterInt();
        }
    }
}

