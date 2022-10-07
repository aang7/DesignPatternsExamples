package com.designpatterns.factory.abstractfactory.abstracts;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;

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
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
