package com.example.cold.Head_First_Design.v1_strategyPattern;

import com.example.cold.Head_First_Design.v1_strategyPattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("不会叫 ");
    }
}
