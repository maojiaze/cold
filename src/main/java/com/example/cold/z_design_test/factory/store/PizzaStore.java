package com.example.cold.z_design_test.factory.store;

import com.example.cold.z_design_test.factory.pizza.*;

public abstract class PizzaStore {
    public Pizza orderPizza(Integer type){
        Pizza pizza=createPizza(type);
        pizza.cut();
        return pizza;
    }

    public abstract Pizza createPizza(Integer type);
}
