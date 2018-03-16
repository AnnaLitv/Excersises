package com.company.lesson3.lesson3_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Store {

    ArrayList<Department> departments;

    public Store(){
        departments = new ArrayList<>();
    }

    public void addDepartment(String name, String kindOfGoods, ArrayList<String> services, int floor){
        departments.add(new Department(name,kindOfGoods,services,floor));
    }

    public void deleteDepartment(String name){
        departments.remove(findDepByName(name));
    }

    public void addGoods(String department, String good){
        findDepByName(department).addGood(good);
    }

    public void sortByFloor(){
        Collections.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
               return Integer.compare(o1.getFloor(),o2.getFloor());
            }
        });
    }

    public void print(){
        for (Department dep: departments) {
            System.out.println(dep.toString());
        }
    }

    private Department findDepByName(String name){
        for (Department dep:departments) {
            if(dep.getName().compareTo(name)==0){
                return dep;
            }
        }
        return null;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    private class Department{
        String name;
        String kindOfGoods;
        ArrayList<String> services;
        ArrayList<String> goods;
        int floor;

        public String getName() {
            return name;
        }

        public String getKindOfGoods() {
            return kindOfGoods;
        }

        public ArrayList<String> getServices() {
            return services;
        }

        public int getFloor() {
            return floor;
        }

        public ArrayList<String> getGoods() {
            return goods;
        }

        public void addGood(String good){
            goods.add(good);
        }

        public Department(String name, String kindOfGoods, ArrayList<String> services, int floor) {
            this.name = name;
            this.kindOfGoods = kindOfGoods;
            this.services = services;
            this.floor = floor;
            goods = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", kindOfGoods='" + kindOfGoods + '\'' +
                    ", services=" + services +
                    ", goods=" + goods +
                    ", floor=" + floor +
                    '}';
        }
    }
}
