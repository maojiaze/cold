package com.example.cold.z_design_test.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CoffeeMenu implements Menu{
    ArrayList coffee;

    public CoffeeMenu() {
        coffee =new ArrayList();
        addItem("coffee1","coffee1 description",false,1.2);
    }

    public void addItem(String name,String description,boolean vegetarian,double price ){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        coffee.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return coffee.iterator();
    }
}
