package com.example.cold.Head_First_Design.v2_observer.java_Observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer ,DisplayElement{

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
         if(obs instanceof WeatherDate){
             WeatherDate weatherDate= (WeatherDate) obs;
             temperature= weatherDate.getTemperature();
             humidity= weatherDate.getHumidity();
             display();
         }
    }

    @Override
    public void display() {
        System.out.println(temperature+"    "+humidity);
    }
}
