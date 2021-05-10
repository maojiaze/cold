package com.example.cold.Head_First_Design.v1_strategyPattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.print("吱吱叫 ");
    }
}
