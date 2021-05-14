package com.example.cold.Head_First_Design.v2_observer.exercise;


import java.util.Observable;
import java.util.Observer;

public class Demon implements Observer {
    private Integer num;
    private Observable observable;

    public Demon(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof People){
            People people= (People) o;
            num=people.getNum();
        }
        System.out.print("第"+num+"次 ");
        System.out.print("demon say: ");
        System.out.println("do it");
    }
}
