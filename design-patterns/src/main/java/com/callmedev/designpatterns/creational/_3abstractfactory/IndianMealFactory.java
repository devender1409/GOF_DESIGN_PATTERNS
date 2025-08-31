package com.callmedev.designpatterns.creational._3abstractfactory;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Dessert;
import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Drink;
import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.MainDish;
import com.callmedev.designpatterns.creational._3abstractfactory.indian.ButterChicken;
import com.callmedev.designpatterns.creational._3abstractfactory.indian.ButterMilk;
import com.callmedev.designpatterns.creational._3abstractfactory.indian.GulabJamun;

public class IndianMealFactory implements MealFactory {
    @Override
    public MainDish createMainDish() {
        return new ButterChicken();
    }

    @Override
    public Dessert createDessert() {
        return new GulabJamun();
    }

    @Override
    public Drink createDrink() {
        return new ButterMilk();
    }
}
