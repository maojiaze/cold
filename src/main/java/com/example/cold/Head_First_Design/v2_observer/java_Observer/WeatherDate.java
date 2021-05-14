package com.example.cold.Head_First_Design.v2_observer.java_Observer;




import org.apache.shiro.crypto.hash.Hash;

import java.util.*;

public class WeatherDate extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
