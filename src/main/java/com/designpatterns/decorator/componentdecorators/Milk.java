package com.designpatterns.decorator.componentdecorators;

import com.designpatterns.decorator.component.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
