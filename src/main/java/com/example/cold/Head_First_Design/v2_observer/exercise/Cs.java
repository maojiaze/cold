package com.example.cold.Head_First_Design.v2_observer.exercise;

public class Cs {
    public static void main(String[] args) {
        People people=new People();
        Angel angel=new Angel(people);
        Demon demon=new Demon(people);
        people.say();
    }
}
