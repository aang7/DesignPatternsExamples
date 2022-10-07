package com.designpatterns.factory.simple;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.printf("Preparing the %s\n", getName());
    }
}
