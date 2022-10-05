package com.designpatterns.decorator.componentdecorators;

import com.designpatterns.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
