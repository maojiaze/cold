package com.example.cold.z_design_test.command;

public class Light {
    int type=0;

    public void on1(){
        System.out.println("light on 1");
        type=1;
    }
    public void on2(){
        System.out.println("light on 2");
        type=2;
    }
    public void on3(){
        System.out.println("light on 3");
        type=3;
    }
    public void off(){
        System.out.println("light off");
        type=0;
    }
}
