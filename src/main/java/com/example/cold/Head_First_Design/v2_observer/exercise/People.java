package com.example.cold.Head_First_Design.v2_observer.exercise;

import java.util.Observable;

/**
 * 简单练习
 * 人说了之后，天使和恶魔回复
 */
public class People extends Observable {
    private  int num=0;

    public void say(){
        System.out.println("can i do it");
        num++;
        setChanged();
        notifyObservers();
    }

    public int getNum() {
        return num;
    }
}
