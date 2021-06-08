package com.example.cold.Head_First_Design.v4_factory;

public class NYStylePizzaStore extends PizzaStore{
    SimplePizzaFactory factory;
    @Override
    Pizza createPizza(String type) {
        Pizza pizza=null   ;
        if(type.equals("clam")){
            pizza=new NYClamPizza();
        }
        return pizza;
    }
}
