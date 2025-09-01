package com.callmedev.designpatterns.creational._1singleton.lazy;

public class DBConnection {
    private DBConnection() {
    }

    public static DBConnection INSTANCE = null;

    public static DBConnection getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DBConnection();
        }
        return INSTANCE;
    }
}
