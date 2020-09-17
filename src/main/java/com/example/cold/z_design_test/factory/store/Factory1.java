package com.example.cold.z_design_test.factory.store;

import com.example.cold.z_design_test.factory.food.Food;
import com.example.cold.z_design_test.factory.food.Food1New;
import com.example.cold.z_design_test.factory.food.Food2New;
import com.example.cold.z_design_test.factory.pizza.Pizza;
import com.example.cold.z_design_test.factory.pizza.PizzaArea1Taste1;
import com.example.cold.z_design_test.factory.pizza.PizzaArea1Taste2;

public class Factory1 extends PizzaStore implements Food {

    @Override
    public Pizza createPizza(Integer type) {
        food1();
        food2();

        Pizza pizza;
        if(type==1){
            pizza=new PizzaArea1Taste1();
        }else{
            pizza=new PizzaArea1Taste2();
        }
        return pizza;
    }

    @Override
    public void food1() {
        new Food1New();
    }

    @Override
    public void food2() {
        new Food2New();
    }
}
