package com.example.cold.z_design_test.template;

public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("brew Coffee Grinds");
    }

    @Override
    public void addCondiments() {
        System.out.println("add Sugar And Milk");
    }
}
