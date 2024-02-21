package com.coherentsolutions.section1;

// RecapSingleton.java

public class RecapSingleton {

    public static void main(String[] args) {
        // Demonstrate Singleton Pattern
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
