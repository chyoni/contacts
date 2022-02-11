package com.singleton;

public class Database {

    private String name;

    private static Database instance;

    public static Database getInstance(String name) {
        if (instance == null) {
            instance = new Database(name);
        }
        return instance;
    }

    public Database(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                '}';
    }
}
