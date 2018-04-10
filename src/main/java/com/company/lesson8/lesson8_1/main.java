package com.company.lesson8.lesson8_1;

import com.company.lesson8.lesson8_1.controler.Controller;
import com.company.lesson8.lesson8_1.model.ReflectionString;
import com.company.lesson8.lesson8_1.view.Viewer;

public class main {
    public static void main(String[] args) {
        ReflectionString reflectionString = new ReflectionString();
        Viewer viewer = new Viewer();
        Controller controller = new Controller(viewer,reflectionString);
        controller.run();
    }
}
