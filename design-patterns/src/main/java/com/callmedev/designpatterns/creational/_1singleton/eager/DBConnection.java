package com.callmedev.designpatterns.creational._1singleton.eager;

public class DBConnection {
    private DBConnection() {
    }

    public static final DBConnection INSTANCE = new DBConnection();//eagerly initialized during the time of class loading

    public static DBConnection getInstance() {
        return INSTANCE;
    }
}
