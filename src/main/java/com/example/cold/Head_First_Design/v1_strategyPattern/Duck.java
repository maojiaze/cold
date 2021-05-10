package com.example.cold.Head_First_Design.v1_strategyPattern;

public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public void swim(){
        System.out.print("游泳戏水 ");
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void  performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
}
