package com.designpatterns.factory.abstractfactory.creators;

import com.designpatterns.factory.abstractfactory.abstracts.Pizza;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaIngredientsFactory;
import com.designpatterns.factory.abstractfactory.abstracts.PizzaStore;
import com.designpatterns.factory.abstractfactory.products.pizzas.ChicagoCheesePizza;
import com.designpatterns.factory.abstractfactory.products.pizzas.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
        name = "Chicago store";
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientsFactory ingredientFactory = new ChicagoIngredientFactory();
        if (type.equals("Cheese"))
            pizza = new ChicagoCheesePizza(ingredientFactory);
        else if (type.equals("VeggiePizza"))
            pizza = new ChicagoVeggiePizza(ingredientFactory);
        return pizza;
    }
}
