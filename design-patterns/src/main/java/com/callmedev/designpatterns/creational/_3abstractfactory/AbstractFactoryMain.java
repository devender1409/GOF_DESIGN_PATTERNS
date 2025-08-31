package com.callmedev.designpatterns.creational._3abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        MealFactory indianCuisine = new IndianMealFactory();
        indianCuisine.createMainDish().serve();
        indianCuisine.createDessert().serve();
        indianCuisine.createDrink().serve();

        System.out.println("----------------------------------------");

        MealFactory italianCuisine = new ItalianMealFactory();
        italianCuisine.createMainDish().serve();
        italianCuisine.createDessert().serve();
        italianCuisine.createDrink().serve();

    }
}
