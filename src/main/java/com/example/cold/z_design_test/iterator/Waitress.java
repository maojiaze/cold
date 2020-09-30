package com.example.cold.z_design_test.iterator;

public class Waitress {
     PancakeHouseMenu pancakeHouseMenu;
     DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        System.out.println("MENU\n---\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nlunch");
        printMenu(dinerIterator);

    }

    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem= (MenuItem) iterator.next();
            System.out.println(menuItem.getName()+"  "+menuItem.getPrice()+"  "+menuItem.getDescription());
        }
    }
}
