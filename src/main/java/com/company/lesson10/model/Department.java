package com.company.lesson10.model;

public class Department {
    private int idDepartment;
    private String name;
    private String phone;

    public Department() {
    }

    public Department(int idDepartment, String name, String phone) {
        this.idDepartment = idDepartment;
        this.name = name;
        this.phone = phone;
    }

    public Department(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "idDepartment=" + idDepartment +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
