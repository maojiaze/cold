package com.example.cold.Head_First_Design.v1_strategyPattern;

import com.example.cold.Head_First_Design.v1_strategyPattern.FlyBehavior;

public class FlyNoWay  implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("不会飞 ");
    }
}
