package com.example.cold.z_design_test.adapter;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("quack");
    }

    @Override
    public void fly() {
        System.out.println("I am fly");
    }
}
