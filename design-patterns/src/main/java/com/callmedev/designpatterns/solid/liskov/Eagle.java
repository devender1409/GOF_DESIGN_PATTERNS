package com.callmedev.designpatterns.solid.liskov;

public class Eagle implements Bird {
    @Override
    public void flyHigh() {
        System.out.println("Sky is the world for me");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating,  dont disturb");
    }
}
