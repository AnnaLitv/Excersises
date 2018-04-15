package com.company.project2.control;

import com.company.project2.model.WorkWithText;
import com.company.project2.model.entities.Text;
import com.company.project2.utils.InputUtils;
import com.company.project2.view.Viewer;

public class Controller {
    private Viewer viewer;
    private WorkWithText workWithText;
    private InputUtils inputUtils = new InputUtils();

    public Controller(Viewer viewer, WorkWithText workWithText) {
        this.viewer = viewer;
        this.workWithText = workWithText;
    }

    public void control(){
        int key = 0;
        viewer.printString(Viewer.MENU);
        key = inputUtils.enterInt();
            while (key != 2) {
                switch (key) {
                    case 1:
                        viewer.printString(Viewer.INPUT_TEXT);
                        workWithText.setText(new Text(inputUtils.enterString()));
                        viewer.printString(Viewer.SORT_RESULT);
                        viewer.printString(workWithText.sortVowelsWords());
                        break;
                    default:
                        break;
                }
                viewer.printString(Viewer.MENU);
                key = inputUtils.enterInt();
            }

    }
}
