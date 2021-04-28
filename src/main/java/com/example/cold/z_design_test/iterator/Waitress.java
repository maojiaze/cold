package com.example.cold.z_design_test.iterator;

import java.util.Iterator;

public class Waitress {

    public void printMenu(){
        System.out.println("all menu");
        IteratorArrayList iteratorArrayList=new IteratorArrayList();
        Iterator iterator= iteratorArrayList.getAll();
        printMenu(iterator);

    }

    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem= (MenuItem) iterator.next();
            System.out.println(menuItem.getName()+"  "+menuItem.getPrice()+"  "+menuItem.getDescription());
        }
    }
}
