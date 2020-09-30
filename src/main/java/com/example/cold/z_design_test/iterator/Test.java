package com.example.cold.z_design_test.iterator;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();

    }
}
