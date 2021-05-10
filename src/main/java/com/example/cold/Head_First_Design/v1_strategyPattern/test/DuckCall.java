package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.FlyBehavior;
import com.example.cold.Head_First_Design.v1_strategyPattern.FlyNoWay;
import com.example.cold.Head_First_Design.v1_strategyPattern.Quack;
import com.example.cold.Head_First_Design.v1_strategyPattern.QuackBehavior;

/**
 * 鸭鸣器 不是鸭子所以不会游泳只会叫，不能继承Duck
 */
public class DuckCall {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void display(){
        System.out.println("鸭鸣器");
    }

    public DuckCall() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void  performQuack(){
        quackBehavior.quack();
    }
}
