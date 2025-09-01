package com.callmedev.designpatterns.creational._1singleton.eager;

public class DBConnectionMain {
    public static void main(String[] args) {

        DBConnection instance1 = DBConnection.getInstance();
        DBConnection instance2 = DBConnection.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
