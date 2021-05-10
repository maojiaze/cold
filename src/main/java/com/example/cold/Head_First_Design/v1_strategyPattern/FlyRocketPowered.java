package com.example.cold.Head_First_Design.v1_strategyPattern;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("利用火箭飞 ");
    }
}
