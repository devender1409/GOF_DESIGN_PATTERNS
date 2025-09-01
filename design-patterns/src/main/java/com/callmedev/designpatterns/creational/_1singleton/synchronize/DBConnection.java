package com.callmedev.designpatterns.creational._1singleton.synchronize;

public class DBConnection {
    private static DBConnection INSTANCE = null;
    private DBConnection() {}

    public synchronized DBConnection getConnection() {
        if(INSTANCE == null) {
            INSTANCE = new DBConnection();
        }
        return INSTANCE;
    }
}
