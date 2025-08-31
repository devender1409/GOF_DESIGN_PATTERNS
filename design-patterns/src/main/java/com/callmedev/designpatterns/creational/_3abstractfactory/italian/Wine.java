package com.callmedev.designpatterns.creational._3abstractfactory.italian;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Drink;

public class Wine implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving wine");
    }
}
