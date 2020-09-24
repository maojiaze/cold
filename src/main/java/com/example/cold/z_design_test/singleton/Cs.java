package com.example.cold.z_design_test.singleton;

public class Cs {
    public static void main(String[] args) {
        One one= One.getInstance();
        one.setName("cs");
        System.out.println(one.getName());

        One one1=One.getInstance();
        System.out.println(one1.getName());

    }
}
