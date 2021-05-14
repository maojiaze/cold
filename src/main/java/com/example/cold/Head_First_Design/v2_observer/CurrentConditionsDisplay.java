package com.example.cold.Head_First_Design.v2_observer;

/**
 * 布告板
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
          this.weatherData=weatherData;
          weatherData.registerObserver(this);
    }



    @Override
    public void update(float temp, float humidity, float pressure) {
          this.temperature=temp;
          this.humidity=humidity;
          display();
    }

    @Override
    public void display() {
        System.out.println(temperature +"     "+humidity);
    }
}
