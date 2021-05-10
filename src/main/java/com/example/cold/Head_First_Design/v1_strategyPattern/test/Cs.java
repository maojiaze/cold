package com.example.cold.Head_First_Design.v1_strategyPattern.test;

import com.example.cold.Head_First_Design.v1_strategyPattern.FlyRocketPowered;

/**
 * 策略模式
 * OO基础：抽象 封装 多态 继承
 * OO原则：封装变化 多用组合少用继承  针对接口编程不针对实现编程
 * OO模式 策略模式：定义算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户
 */
public class Cs {

    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println();

        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        System.out.println();

        RubberDuck rubberDuck=new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println();

        DecoyDuck decoyDuck=new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println();

        ModelDuck modelDuck=new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.print("增加动力 ");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        System.out.println();

        DuckCall duckCall=new DuckCall();
        duckCall.display();
        duckCall.performFly();
        duckCall.performQuack();

    }
}
