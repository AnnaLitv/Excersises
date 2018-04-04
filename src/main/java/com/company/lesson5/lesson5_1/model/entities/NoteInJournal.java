package com.company.lesson5.lesson5_1.model.entities;

public class NoteInJournal {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String phone;
    private String address;

    public NoteInJournal(){}

    public NoteInJournal(String lastName, String firstName, String dateOfBirth, String phone, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NoteInJournal{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
