package com.designpatterns.factory.method.products;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
        toppings.add("Red Pepper");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing new york style veggie pizza...");
    }
}
