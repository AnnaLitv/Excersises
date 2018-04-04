package com.company.lesson5.lesson5_1;

import com.company.lesson5.lesson5_1.controller.Controller;
import com.company.lesson5.lesson5_1.model.Model;
import com.company.lesson5.lesson5_1.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(view,model);
        controller.control();
    }
}
