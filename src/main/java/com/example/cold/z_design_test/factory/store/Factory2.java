package com.example.cold.z_design_test.factory.store;

import com.example.cold.z_design_test.factory.food.Food;
import com.example.cold.z_design_test.factory.food.Food1Old;
import com.example.cold.z_design_test.factory.food.Food2Old;
import com.example.cold.z_design_test.factory.pizza.*;
import org.apache.ibatis.javassist.CodeConverter;

public class Factory2 extends PizzaStore implements Food {

    @Override
    public Pizza createPizza(Integer type) {
        Food1Old food1Old=new Food1Old();
        Food2Old food2Old=new Food2Old();

        Pizza pizza;
        if(type==1){
            pizza=new PizzaArea2Taste1();
        }else{
            pizza=new PizzaArea2Taste2();
        }
        return pizza;
    }

    @Override
    public void food1() {
        new Food1Old();


    }

    @Override
    public void food2() {
        new Food2Old();
    }
}
