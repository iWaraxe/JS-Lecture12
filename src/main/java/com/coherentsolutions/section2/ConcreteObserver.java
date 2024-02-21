package com.coherentsolutions.section2;

// Concrete Observer class
public class ConcreteObserver implements Observer {
    @Override
    public void update(int state) {
        System.out.println(this);
        System.out.println("State has been updated to: " + state);
    }
}
