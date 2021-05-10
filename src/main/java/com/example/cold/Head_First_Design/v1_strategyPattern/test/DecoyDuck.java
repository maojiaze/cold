package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.Duck;
import com.example.cold.Head_First_Design.v1_strategyPattern.FlyNoWay;
import com.example.cold.Head_First_Design.v1_strategyPattern.MuteQuack;

/**
 * 诱饵鸭 不会叫不会飞
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("诱饵鸭");
    }

    public DecoyDuck() {
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }
}
