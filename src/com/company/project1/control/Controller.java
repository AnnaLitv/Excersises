package com.company.project1.control;

import com.company.project1.model.Airline;
import com.company.project1.utils.InputUtils;
import com.company.project1.view.Viewer;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Viewer viewer;
    private Airline airline;

    public Controller(Airline airline,Viewer viewer){
        this.airline=airline;
        this.viewer=viewer;
    }

    public void control(){
        int c = 0;
        Viewer.menuOutput();
        c = InputUtils.enterInt();
        while(c!=6){
            switch (c){
                case 1:
                    airline.initPlanesByStandart();
                    break;
                case 2:
                    if(airline.getPlanes().size()!=0){
                        viewer.ArrayOutput(airline.getPlanes());
                    }else{
                        viewer.showMessage(Viewer.NULL_LIST);
                    }
                    break;
                case 3:
                    if(airline.getPlanes().size()!=0){
                        viewer.ArrayOutput(airline.sortByFlightLength());
                    }else{
                        viewer.showMessage(Viewer.NULL_LIST);
                    }
                    break;
                case 4:
                    if(airline.getPlanes().size()!=0){
                        viewer.showMessage(Viewer.GENERAL_CAPACITY);
                        viewer.showInt(airline.calculateCapacity());
                        viewer.showMessage(Viewer.GENERAL_CARRYING);
                        viewer.showInt(airline.calculateCarrying());
                    }else {
                        viewer.showMessage(Viewer.NULL_LIST);
                    }
                    break;
                case 5:
                    if(airline.getPlanes().size()!=0){
                        viewer.showMessage(Viewer.INPUT_START_DIAPASON);
                        int start = InputUtils.enterInt();
                        viewer.showMessage(Viewer.INPUT_START_DIAPASON);
                        int end = InputUtils.enterInt();
                        if(airline.getPlanesInDiapasonFuel(start,end).size()!=0) {
                            viewer.ArrayOutput(airline.getPlanesInDiapasonFuel(start, end));
                        }else {
                            viewer.showMessage(Viewer.NULL_LIST);
                        }
                    }else {
                        viewer.showMessage(Viewer.NULL_LIST);
                    }
                    break;
                default:
                    break;
            }
            Viewer.menuOutput();
            c = InputUtils.enterInt();
        }
    }
}
