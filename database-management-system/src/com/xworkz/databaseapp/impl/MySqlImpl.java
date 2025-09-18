package com.xworkz.databaseapp.impl;

import com.xworkz.databaseapp.databse.Database;

public class MySqlImpl implements Database {
    @Override
    public void connect() {
        System.out.println("MySql database connected");
    }

    @Override
    public void query() {
        System.out.println("MySql database executes queries");
    }

    @Override
    public void disconnect() {
        System.out.println("MySql database disconnected");
    }
}
