package com.callmedev.designpatterns.creational._3abstractfactory.indian;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Dessert;

public class GulabJamun implements Dessert {
    @Override
    public void serve() {
        System.out.println("Serving Gulab Jamun");
    }
}
