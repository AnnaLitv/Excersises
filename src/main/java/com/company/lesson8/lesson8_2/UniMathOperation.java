package com.company.lesson8.lesson8_2;

public class UniMathOperation {
    private double number;

    public UniMathOperation(){}

    public UniMathOperation(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void increment(){
        number++;
    }

    public void decrement(){
        number--;
    }

    public void changeSign(){
        number=-number;
    }

    @Override
    public String toString() {
        return "UniMathOperation{" +
                "number=" + number +
                '}';
    }
}
