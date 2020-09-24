package com.example.cold.z_design_test.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck=new MallardDuck();

        WildTurkey turkey=new WildTurkey();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);

        System.out.println("the turkey say======================");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck say=====================");
        testDuck(duck);
        System.out.println("the turkeyAdapter say=======================");
        testDuck(turkeyAdapter);

        Turkey duckAdapter =new DuckAdapter(duck);
        System.out.println("the duck say====================");
        duck.quack();
        duck.fly();

        System.out.println("the turkey say=====================");
        testTurkey(turkey);
        System.out.println("the duckAdapter say=====================");
        testTurkey(duckAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }

}
