package com.designpatterns.factory.abstractfactory.abstracts;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;

public abstract class PizzaStore {
    public String name;

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        System.out.printf("ordering pizza from %s store\n", getName());
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public String getName() {
        return this.name;
    }
}
