package com.designpatterns.factory.method.creators;

import com.designpatterns.factory.method.products.Pizza;

public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);
    public void orderPizza() {
        System.out.println("ordering pizza...");
    }
}
