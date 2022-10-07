package com.designpatterns.factory.simple;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(simplePizzaFactory);
        store.orderPizza("cheese");
    }
}
