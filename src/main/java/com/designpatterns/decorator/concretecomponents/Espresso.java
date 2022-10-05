package com.designpatterns.decorator.concretecomponents;

import com.designpatterns.decorator.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 5.34;
    }
}
