package com.designpatterns.factory.abstractfactory.creators;


import com.designpatterns.factory.abstractfactory.abstracts.*;
import com.designpatterns.factory.abstractfactory.products.ingredients.*;

public class NeyYorkIngredientFactory implements PizzaIngredientsFactory {
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Spinach(), new BlackOlives() };
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Dough createDough() {
        return new StandardDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
