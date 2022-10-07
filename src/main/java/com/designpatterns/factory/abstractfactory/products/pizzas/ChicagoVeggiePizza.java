package com.designpatterns.factory.abstractfactory.products.pizzas;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaIngredientsFactory;

public class ChicagoVeggiePizza extends Pizza {
    PizzaIngredientsFactory ingredientFactory;

    public ChicagoVeggiePizza(PizzaIngredientsFactory factory) {
        this.ingredientFactory = factory;
        name = "Chicago Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        // set the ingredients
        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
