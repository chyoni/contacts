package com.singleton;

public class Main {

    public static void main(String[] args) {
        Database db = Database.getInstance("db_music");
        Database db2 = Database.getInstance("db_movie");
        System.out.println(db);
        System.out.println(db2);
    }
}
