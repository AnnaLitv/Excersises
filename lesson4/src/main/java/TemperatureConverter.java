package com.company.lesson4.src.main.java;

public class TemperatureConverter {

    TemperatureConverter(){

    }
    public double ConvertFtoC(double farenheit){
        return (farenheit - 32.0) / 9.0 * 5.0;
    }
    public double ConvertCtoF(double celsius){
        return celsius / 5.0 * 9.0 + 32.0;
    }
    public double ConvertCtoK(double celsius){
        return celsius + 273.2;
    }
    public double ConvertKtoC(double kelvin){
        return kelvin - 273.2;
    }
    public double ConvertFtoK(double farenheit){
        return (farenheit + 459.7) / 9.0 * 5.0;
    }
    public double ConvertKtoF(double kelvin){
        return kelvin / 5.0 * 9.0 - 459.7;
    }
}
