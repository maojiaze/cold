package com.example.cold.Head_First_Design.v3_decorator;

public abstract class Beverage {
    public String  description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
