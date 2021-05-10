package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.Duck;
import com.example.cold.Head_First_Design.v1_strategyPattern.FlyNoWay;
import com.example.cold.Head_First_Design.v1_strategyPattern.MuteQuack;

/**
 * 模型鸭
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("模型鸭");
    }

    public ModelDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
}
