package com.designpatterns.decorator.concretecomponents;

import com.designpatterns.decorator.component.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 3.12;
    }
}
