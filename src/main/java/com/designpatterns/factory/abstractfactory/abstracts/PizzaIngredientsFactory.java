package com.designpatterns.factory.abstractfactory.abstracts;

public interface PizzaIngredientsFactory {
    Veggies[] createVeggies();
    Cheese createCheese();
    Dough createDough();
    Sauce createSauce();
}
