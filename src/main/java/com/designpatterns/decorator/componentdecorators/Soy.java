package com.designpatterns.decorator.componentdecorators;

import com.designpatterns.decorator.component.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.80;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
