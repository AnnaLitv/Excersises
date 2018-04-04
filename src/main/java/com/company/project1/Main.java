package com.company.project1;

import com.company.project1.control.Controller;
import com.company.project1.model.Airline;
import com.company.project1.view.Viewer;

public class Main {

    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        Airline airline = new Airline();
        Controller controller = new Controller(airline,viewer);
        controller.control();
    }
}
