package com.designpatterns.factory.method.products;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing New York Style cheese pizza...");
    }
}
