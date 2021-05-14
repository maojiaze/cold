package com.example.cold.Head_First_Design.v2_observer.java_Observer;

public class Cs {
    public static void main(String[] args) {
        WeatherDate weatherDate=new WeatherDate();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherDate);
        weatherDate.setMeasurements(1,1,1);
    }
}
