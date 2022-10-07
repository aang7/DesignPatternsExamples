package com.designpatterns.factory.abstractfactory.products.pizzas;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaIngredientsFactory;

public class NewYorkVeggiePizza extends Pizza {
    PizzaIngredientsFactory ingredientFactory;
    public NewYorkVeggiePizza(PizzaIngredientsFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "New York Veggie Pizza";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        // set the ingredients
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
