package com.company.lesson2.lesson2_2.controller;

import com.company.lesson6.Serialization;
import com.company.lesson2.lesson2_2.model.entities.Patient;
import com.company.lesson2.lesson2_2.model.ActionWithPatient;
import com.company.lesson2.lesson2_2.utilities.InputUtility;
import com.company.lesson2.lesson2_2.view.Viewer;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    ActionWithPatient actionWithPatient = new ActionWithPatient();
    Viewer viewer = new Viewer();
    InputUtility inputUtility = new InputUtility();

    public Controller(Viewer viewer, ActionWithPatient actionWithPatient){
        this.actionWithPatient=actionWithPatient;
        this.viewer=viewer;
    }

    public void run(){
       int c = 0;
        viewer.menuOutput();
        c = inputUtility.enterInt();
        actionWithPatient.fillStandart();
       while(c!=7){
            switch (c){
                case 1:
                    viewer.showMessage(viewer.INPUT_DIAGNOS);
                    String diagnos = inputUtility.enterString();
                    ArrayList<Patient> patients =actionWithPatient.diagnosCheck(diagnos);
                    if(patients!=null){
                        viewer.ArrayOutput(patients);
                    }else {
                        viewer.showMessage("Нет пациэнтов в этой категории");
                    }
                    break;
                case 2:
                    viewer.showMessage(viewer.INPUT_START_DIAPASON);
                    int start = inputUtility.enterInt();
                    viewer.showMessage(viewer.INPUT_END_DIAPASON);
                    int end = inputUtility.enterInt();
                    ArrayList<Patient> patients1 = actionWithPatient.getPatientsFromDiapason(start,end);
                    if(patients1!=null){
                        viewer.ArrayOutput(patients1);
                    }else {
                        viewer.showMessage("Нет пациэнтов в этом диапазоне");
                    }
                    break;
                case 3:
                    viewer.ArrayOutput(actionWithPatient.sortPatients());
                    break;
                case 4:
                    viewer.ArrayOutput(actionWithPatient.getPatients());
                    break;
                case 5:
                    Serialization ser = new Serialization();
                    viewer.showMessage(viewer.INPUT_NAME_OF_FILE);
                    String nameOfFile = inputUtility.enterString();
                    viewer.showMessage(viewer.INPUT_FORMAT);
                    String formatOfFile = inputUtility.enterString();
                    ser.serIn(actionWithPatient.getPatients(),nameOfFile,formatOfFile);
                    break;
                case 6:
                    ser = new Serialization();
                    viewer.showMessage(viewer.INPUT_NAME_OF_FILE);
                    nameOfFile = inputUtility.enterString();
                    viewer.showMessage(viewer.INPUT_FORMAT);
                    formatOfFile = inputUtility.enterString();
                    viewer.ArrayOutput((List<Patient>) ser.deserIn(nameOfFile,formatOfFile));
                    break;
                default:
                    break;
            }
            viewer.menuOutput();
            c = inputUtility.enterInt();
       }
    }
}
