package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.Duck;
import com.example.cold.Head_First_Design.v1_strategyPattern.FlyWithWings;
import com.example.cold.Head_First_Design.v1_strategyPattern.Quack;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck {


    @Override
    public void display() {
        System.out.println("绿头鸭");
    }

    public MallardDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
}
