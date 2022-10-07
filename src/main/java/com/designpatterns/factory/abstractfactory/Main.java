package com.designpatterns.factory.abstractfactory;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaStore;
import com.designpatterns.factory.abstractfactory.creators.ChicagoPizzaStore;
import com.designpatterns.factory.abstractfactory.creators.NewYorkStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYorkStore();
        Pizza pizza = pizzaStore.orderPizza("Cheese");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza2 = chicagoStore.orderPizza("VeggiePizza");
    }
}
