package com.company.project2;

import com.company.project2.control.Controller;
import com.company.project2.model.WorkWithText;
import com.company.project2.model.entities.Text;
import com.company.project2.view.Viewer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkWithText workWithText = new WorkWithText();
        Viewer viewer = new Viewer();
        Controller controller = new Controller(viewer,workWithText);
        controller.control();
    }
}
