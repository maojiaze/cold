package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.Duck;
import com.example.cold.Head_First_Design.v1_strategyPattern.FlyNoWay;
import com.example.cold.Head_First_Design.v1_strategyPattern.Squeak;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("橡皮鸭");
    }

    public RubberDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new Squeak();
    }
}
