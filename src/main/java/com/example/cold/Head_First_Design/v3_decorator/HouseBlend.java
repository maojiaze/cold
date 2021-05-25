package com.example.cold.Head_First_Design.v3_decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description="house blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
