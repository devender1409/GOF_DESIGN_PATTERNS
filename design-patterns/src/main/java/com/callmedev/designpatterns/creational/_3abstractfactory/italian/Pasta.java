package com.callmedev.designpatterns.creational._3abstractfactory.italian;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.MainDish;

public class Pasta implements MainDish {
    @Override
    public void serve() {
        System.out.println("Serving Pasta");
    }
}
