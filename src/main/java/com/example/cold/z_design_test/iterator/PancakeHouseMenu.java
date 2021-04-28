package com.example.cold.z_design_test.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;
    public PancakeHouseMenu(){
        menuItems=new ArrayList();
        addItem("pancakeName1","description1",true,1.0);
        addItem("pancakeName2","description2",true,1.2);
        addItem("pancakeName3","description3",true,1.1);
        addItem("pancakeName4","description4",false,2.5);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }

}
