package com.example.cold.z_design_test.template;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("steep Rea Bag");
    }

    @Override
    public void addCondiments() {
        System.out.println("add Lemon");
    }

}
