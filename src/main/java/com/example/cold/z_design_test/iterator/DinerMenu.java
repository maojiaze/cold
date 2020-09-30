package com.example.cold.z_design_test.iterator;

public class DinerMenu {
    static final int MAX_ITEMS=6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems=new MenuItem[MAX_ITEMS];
        addItem("dinerName1","description1",true,5.0);
        addItem("dinerName2","description2",true,6.5);
        addItem("dinerName3","description3",true,4.5);
        addItem("dinerName4","description4",false,12);

    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
        if(numberOfItems>=MAX_ITEMS){
            System.out.println("menu full");
        }else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return  new DinerMenuIterator(menuItems);
    }
}
