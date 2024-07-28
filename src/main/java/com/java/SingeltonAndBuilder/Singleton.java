package com.java.SingeltonAndBuilder;

/*
 * Singleton Design Pattern
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Herkese Merhaba!");
    }
}

