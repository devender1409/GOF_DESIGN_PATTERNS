package com.callmedev.designpatterns.creational._3abstractfactory;

import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Dessert;
import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.Drink;
import com.callmedev.designpatterns.creational._3abstractfactory.abstractproducts.MainDish;

public interface MealFactory {
    MainDish createMainDish();
    Dessert createDessert();
    Drink createDrink();
}
