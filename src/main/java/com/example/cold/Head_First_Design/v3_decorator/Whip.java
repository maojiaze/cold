package com.example.cold.Head_First_Design.v3_decorator;

public class Whip extends ConditionDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description+" whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.1;
    }
}
