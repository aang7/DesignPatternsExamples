package com.designpatterns.factory.method.creators;

import com.designpatterns.factory.method.products.NYStyleCheesePizza;
import com.designpatterns.factory.method.products.NYStyleVeggiePizza;
import com.designpatterns.factory.method.products.Pizza;

public class NewYorkPizzaStore extends PizzaStore{

    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new NYStyleCheesePizza();
        else if (type.equals("veggie"))
            return new NYStyleVeggiePizza();
        else return null;
    }

}
