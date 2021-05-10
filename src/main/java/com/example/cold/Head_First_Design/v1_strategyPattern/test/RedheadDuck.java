package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.Duck;
import com.example.cold.Head_First_Design.v1_strategyPattern.FlyWithWings;
import com.example.cold.Head_First_Design.v1_strategyPattern.Quack;

/**
 * 红头鸭
 */
public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("红头鸭");
    }

    public RedheadDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
}
