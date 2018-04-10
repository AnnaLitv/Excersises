package com.company.lesson8.lesson8_1.controler;

import com.company.lesson6.Serialization;
import com.company.lesson7.model.ActionWithPatient;
import com.company.lesson7.model.entities.Patient;
import com.company.lesson8.lesson8_1.model.ReflectionString;
import com.company.lesson8.lesson8_1.utils.InputUtility;
import com.company.lesson7.utilities.ResourceManager;
import com.company.lesson8.lesson8_1.view.Viewer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Controller {

    ReflectionString reflectionString = new ReflectionString();
    Viewer viewer = new Viewer();
    InputUtility inputUtility = new InputUtility();

    public Controller(Viewer viewer,ReflectionString reflectionString){
        this.reflectionString=reflectionString;
        this.viewer=viewer;
    }

    public void run(){
        int c = 0;
        viewer.menuOutput();
        c = inputUtility.enterInt();
        while(c!=5){
            switch (c){
                case 1:
                    reflectionString.setStr("apple");
                    break;
                case 2:
                    viewer.showMessage(Viewer.INPUT_STRING);
                    reflectionString.setStr(InputUtility.enterString());
                    break;
                case 3:
                    viewer.showMessage(Viewer.INPUT_REPLACE_STRING);
                    viewer.showMessage(reflectionString.replace(InputUtility.enterString()));
                    break;
                case 4:
                    viewer.showMessage(reflectionString.getStr());
                    break;
                default:
                    break;
            }
            viewer.menuOutput();
            c = inputUtility.enterInt();
        }
    }


}
