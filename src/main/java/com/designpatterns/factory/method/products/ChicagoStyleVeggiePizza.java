package com.designpatterns.factory.method.products;

public class ChicagoStyleVeggiePizza extends Pizza{

    public ChicagoStyleVeggiePizza() {
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chicago style veggie pizza...");
    }
}
