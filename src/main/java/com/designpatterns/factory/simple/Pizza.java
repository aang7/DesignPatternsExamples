package com.designpatterns.factory.simple;

public abstract class Pizza {

    public abstract void prepare();
    public void bake() {
        System.out.println("baking the pizza...");
    }
    public void cut() {
        System.out.println("cutting the pizza...");
    }
    public void box() {
        System.out.println("boxing the pizza...");
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}