package com.designpatterns.factory.method;

import com.designpatterns.factory.method.creators.NewYorkPizzaStore;
import com.designpatterns.factory.method.creators.PizzaStore;
import com.designpatterns.factory.method.products.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore newYorkStore = new NewYorkPizzaStore();
        Pizza pizza = newYorkStore.createPizza("cheese");
        pizza.prepare();
    }
}
