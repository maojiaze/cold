package com.example.cold.Head_First_Design.v1_strategyPattern;

public class Quack  implements QuackBehavior{
    @Override
    public void quack() {
        System.out.print("呱呱叫 ");
    }
}
