package com.example.cold.Head_First_Design.v3_decorator;

public class Milk extends ConditionDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.1;
    }
}
