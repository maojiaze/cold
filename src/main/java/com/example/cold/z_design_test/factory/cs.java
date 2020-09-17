package com.example.cold.z_design_test.factory;

import com.example.cold.z_design_test.factory.store.Factory1;
import com.example.cold.z_design_test.factory.store.PizzaStore;

/**
 * 设计模式 工厂模式 测试
 */
public class cs {
    public static void main(String[] args) {
        PizzaStore pizzaStore=new Factory1();
        pizzaStore.orderPizza(2);
    }
}
