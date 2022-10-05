package com.designpatterns.decorator;

import com.designpatterns.decorator.component.Beverage;
import com.designpatterns.decorator.componentdecorators.Milk;
import com.designpatterns.decorator.componentdecorators.Mocha;
import com.designpatterns.decorator.componentdecorators.Soy;
import com.designpatterns.decorator.concretecomponents.Decaf;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Decaf();
        beverage1 = new Milk(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println("Coffee cost: " + beverage1.cost());
        System.out.println("Product description: " + beverage1.getDescription());
    }
}
