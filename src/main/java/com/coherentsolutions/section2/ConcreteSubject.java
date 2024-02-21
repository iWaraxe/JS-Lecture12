package com.coherentsolutions.section2;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject class
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("\nNotifying observers");
        for (Observer o : observers) {
            o.update(state);
        }
    }
}
