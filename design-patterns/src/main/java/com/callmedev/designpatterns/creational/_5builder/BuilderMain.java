package com.callmedev.designpatterns.creational._5builder;

import java.math.BigDecimal;

public class BuilderMain {
    public static void main(String[] args) {
        Burger burger = new Burger.Builder()
                .setBun("Britannia")
                .setCabbage(true)
                .setSauce(false)
                .setCheese(true)
                .setPrice(BigDecimal.valueOf(25.50))
                .setName("Double Meal")
                .build();


        System.out.println("Burger Built with Builder DP : " + burger.toString());
    }
}
