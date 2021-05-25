package com.example.cold.Head_First_Design.v3_decorator;

public class Soy extends ConditionDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description+" Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }
}
