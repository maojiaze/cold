package com.example.cold.Head_First_Design.v4_factory;


public  class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("clam")){
            pizza=new ClamPizza();
        }
        return pizza;
    }
}
