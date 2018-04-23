package com.company.lesson10.model;

public class Emploee {
    private int idEmploees;
    private String lastName;
    private String firstName;
    private String position;
    private int departmentId;

    public Emploee() {
    }

    public Emploee(int idEmploees, String lastName, String firstName, String position, int departmentId) {
        this.idEmploees = idEmploees;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.departmentId = departmentId;
    }

    public Emploee(String lastName, String firstName, String position, int departmentId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.departmentId = departmentId;
    }

    public int getIdEmploees() {
        return idEmploees;
    }

    public void setIdEmploees(int idEmploees) {
        this.idEmploees = idEmploees;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "idEmploees=" + idEmploees +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", position='" + position + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
