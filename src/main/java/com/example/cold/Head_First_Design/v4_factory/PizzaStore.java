package com.example.cold.Head_First_Design.v4_factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);

}
