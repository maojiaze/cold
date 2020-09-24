package com.example.cold.z_design_test.adapter;

import java.util.Random;

public class DuckAdapter implements Turkey {

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        Random random=new Random();
        if(random.nextInt(5)==0){
            duck.fly();
        }
    }
}
