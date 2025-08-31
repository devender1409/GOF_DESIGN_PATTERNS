package com.callmedev.designpatterns.creational._3abstractfactory.indian;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.MainDish;

public class ButterChicken implements MainDish {
    @Override
    public void serve() {
        System.out.println("Serving Butter Chicken");
    }
}
