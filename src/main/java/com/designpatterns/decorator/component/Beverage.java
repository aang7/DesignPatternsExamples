package com.designpatterns.decorator.component;

public abstract class Beverage {
    public String description;
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
