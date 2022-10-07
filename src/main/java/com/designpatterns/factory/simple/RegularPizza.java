package com.designpatterns.factory.simple;

public class RegularPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.printf("Preparing the %s\n", getName());
    }
}
