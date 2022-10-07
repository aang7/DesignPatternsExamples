package com.designpatterns.factory.abstractfactory.creators;

import com.designpatterns.factory.abstractfactory.abstracts.*;
import com.designpatterns.factory.abstractfactory.products.ingredients.*;

public class ChicagoIngredientFactory implements PizzaIngredientsFactory {
    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] { new Spinach(), new BlackOlives() };
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Dough createDough() {
        return new StandardDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }
}
