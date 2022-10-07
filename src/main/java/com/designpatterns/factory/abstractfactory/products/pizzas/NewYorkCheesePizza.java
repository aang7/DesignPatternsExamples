package com.designpatterns.factory.abstractfactory.products.pizzas;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaIngredientsFactory;

public class NewYorkCheesePizza extends Pizza {
    PizzaIngredientsFactory ingredientFactory;

    public NewYorkCheesePizza(PizzaIngredientsFactory factory) {
        ingredientFactory = factory;
        name = "New York Cheese Pizza";
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        // set the ingredients
        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        veggies = ingredientFactory.createVeggies();
    }
}
