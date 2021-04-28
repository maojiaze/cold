package com.example.cold.z_design_test.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorArrayList {
    Menu pancakeHouseMenu=new PancakeHouseMenu();
    Menu dinerMenu=new DinerMenu();
    Menu coffeeMenu=new CoffeeMenu();

    public Iterator getAll(){
        List temp = new ArrayList();
        Iterator iterator1=pancakeHouseMenu.createIterator();
        Iterator iterator2=dinerMenu.createIterator();
        Iterator iterator3=coffeeMenu.createIterator();

        while(iterator1.hasNext()){
            temp.add(iterator1.next());
        }
        while(iterator2.hasNext()){
            temp.add(iterator2.next());
        }
        while(iterator3.hasNext()){
            temp.add(iterator3.next());
        }
        Iterator iterator=temp.iterator();
        return iterator;
    }
}
