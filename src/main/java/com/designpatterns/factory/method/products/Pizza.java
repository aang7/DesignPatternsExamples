package com.designpatterns.factory.method.products;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

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
