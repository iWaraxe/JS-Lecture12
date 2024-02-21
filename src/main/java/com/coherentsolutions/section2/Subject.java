package com.coherentsolutions.section2;

// Subject interface
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
