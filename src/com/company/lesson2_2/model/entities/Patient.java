package com.company.lesson2_2.model.entities;

public class Patient {
    private String firstName;
    private String lastName;
    private String famName;
    private String address;
    private String phone;
    private int numberOfMed;
    private String diagnos;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFamName() {
        return famName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public int getNumberOfMed() {
        return numberOfMed;
    }
    public String getDiagnos() {
        return diagnos;
    }


    public Patient(String firstName, String lastName, String famName, String address, String phone, int numberOfMed, String diagnos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.famName = famName;
        this.address = address;
        this.phone = phone;
        this.numberOfMed = numberOfMed;
        this.diagnos = diagnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (numberOfMed != patient.numberOfMed) return false;
        if (firstName != null ? !firstName.equals(patient.firstName) : patient.firstName != null) return false;
        if (lastName != null ? !lastName.equals(patient.lastName) : patient.lastName != null) return false;
        if (famName != null ? !famName.equals(patient.famName) : patient.famName != null) return false;
        if (address != null ? !address.equals(patient.address) : patient.address != null) return false;
        if (phone != null ? !phone.equals(patient.phone) : patient.phone != null) return false;
        return diagnos != null ? diagnos.equals(patient.diagnos) : patient.diagnos == null;
    }

    @Override
    public String toString() {
        return numberOfMed+" "+firstName+" "+lastName+" "+famName+" "+address+" "+phone+" "+diagnos;
    }
}
