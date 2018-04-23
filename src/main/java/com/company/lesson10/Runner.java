package com.company.lesson10;

import com.company.lesson10.dao.DAO;
import com.company.lesson10.model.Emploee;
import com.company.lesson10.model.Task;

import java.util.List;

public class Runner {
    public void run(){
        DAO dao = new DAO();
        List<Emploee> emploeeList = dao.selectAllEmploees();
        List<Emploee> emploeeList1 = dao.selectAllEmploeesOfDepartment(2);
        List<Task> tasks = dao.selectAllTasks();
        Task task = new Task("Поработать",1);
        dao.addTaskForEmploee(task,1);
        List<Task> tasks1 = dao.selectAllTasksForEmploee(1);

        dao.deleteEmoloeeById(1);

        List<Emploee> emploees = dao.selectAllEmploees();

        printEmp(emploeeList);
        System.out.println("");
        printEmp(emploeeList1);
        System.out.println("");
        printTask(tasks);
        System.out.println("");
        printTask(tasks1);
        System.out.println("");
        printEmp(emploees);
    }

    private void printEmp(List<Emploee> list){
        for (Emploee e:list) {
            System.out.println(e);
        }
    }
    private void printTask(List<Task> list){
        for (Task t:list) {
            System.out.println(t);
        }
    }
}
