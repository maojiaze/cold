package com.example.cold.z_design_test.template;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();


    public void boilWater() {
        System.out.println("boil Water");
    }

    public void pourInCup(){
        System.out.println("pour In Cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
