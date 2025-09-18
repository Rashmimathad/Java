package com.xworkz.databaseapp;

import com.xworkz.databaseapp.databse.Database;
import com.xworkz.databaseapp.impl.MySqlImpl;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database=new MySqlImpl();
        database.connect();
        database.query();
        database.disconnect();
    }
}
