package com.designpatterns.factory.method.creators;

import com.designpatterns.factory.method.products.ChicagoStyleCheesePizza;
import com.designpatterns.factory.method.products.ChicagoStyleVeggiePizza;
import com.designpatterns.factory.method.products.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new ChicagoStyleCheesePizza();
        else if (type.equals("veggie"))
            return new ChicagoStyleVeggiePizza();
        else return null;
    }
}
