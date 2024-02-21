package com.coherentsolutions.section2;

// ObserverPatternExample.java

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternExample {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver();
        System.out.println(observer1);
        Observer observer2 = new ConcreteObserver();
        System.out.println(observer2);

        // Adding observers
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Changing state
        subject.setState(5);  // Both observers will be notified
    }
}




