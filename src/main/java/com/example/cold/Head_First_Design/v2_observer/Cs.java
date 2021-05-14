package com.example.cold.Head_First_Design.v2_observer;

/**
 * 观察者模式
 * OO基础：抽象
 * OO原则：封装变化 多用组合少用继承  针对接口编程不针对实现编程  为交互对象之间的松耦合设计而努力
 * OO模式 观察者模式：在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖他的对象会收到通知，并自动更新
 */
public class Cs {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1,1,1);
    }
}
