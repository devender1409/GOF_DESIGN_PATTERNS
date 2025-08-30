package com.callmedev.designpatterns.creational._4prototype;

public interface Prototype<T> extends Cloneable {
    T clone();
}
