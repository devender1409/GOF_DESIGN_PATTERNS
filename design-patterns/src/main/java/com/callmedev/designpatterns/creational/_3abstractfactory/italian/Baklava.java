package com.callmedev.designpatterns.creational._3abstractfactory.italian;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Dessert;

public class Baklava implements Dessert {
    @Override
    public void serve() {
        System.out.println("Serving Baklava");
    }
}
