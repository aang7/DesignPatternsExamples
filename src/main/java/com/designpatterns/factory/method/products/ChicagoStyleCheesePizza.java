package com.designpatterns.factory.method.products;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style cheese pizza...");
    }
}
