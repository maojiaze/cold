package com.example.cold.Head_First_Design.v3_decorator;

public class Mocha extends ConditionDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription()+" Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }
}
