package com.callmedev.designpatterns.creational._3abstractfactory;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Dessert;
import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Drink;
import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.MainDish;
import com.callmedev.designpatterns.creational._3abstractfactory.italian.Baklava;
import com.callmedev.designpatterns.creational._3abstractfactory.italian.Pasta;
import com.callmedev.designpatterns.creational._3abstractfactory.italian.Wine;

public class ItalianMealFactory implements MealFactory {
    @Override
    public MainDish createMainDish() {
        return new Pasta();
    }

    @Override
    public Dessert createDessert() {
        return new Baklava();
    }

    @Override
    public Drink createDrink() {
        return new Wine();
    }
}
