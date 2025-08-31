package com.callmedev.designpatterns.solid.liskov;

public class Emu implements Bird {
    @Override
    public void flyHigh() {
        throw new RuntimeException("I can't fly");
    }

    @Override
    public void eat() {
        System.out.println("I can eat too, but peacefully");
    }
}
