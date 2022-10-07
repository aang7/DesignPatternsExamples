package com.designpatterns.factory.abstractfactory.creators;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaIngredientsFactory;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaStore;
import com.designpatterns.factory.abstractfactory.products.pizzas.NewYorkCheesePizza;
import com.designpatterns.factory.abstractfactory.products.pizzas.NewYorkVeggiePizza;

public class NewYorkStore extends PizzaStore {
    public NewYorkStore() {
        name = "New York Store";
    }

    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientsFactory ingredientFactory = new NeyYorkIngredientFactory();

        if (type.equals("Cheese"))
            pizza = new NewYorkCheesePizza(ingredientFactory);
        else if (type.equals("VeggiePizza"))
            pizza = new NewYorkVeggiePizza(ingredientFactory);

        return pizza;
    }
}
