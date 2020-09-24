package com.example.cold.z_design_test.adapter;

import java.util.Random;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am fly a short distance");
    }
}
