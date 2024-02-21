package com.coherentsolutions.section3;

// StrategyPatternExample.java

public class StrategyPatternExample {
    public static void main(String[] args) {
        ArrayContext context = new ArrayContext();

        // Using BubbleSort strategy
        context.setStrategy(new BubbleSort());
        context.executeStrategy(new int[]{1, 4, 2});

        // Using QuickSort strategy
        context.setStrategy(new QuickSort());
        context.executeStrategy(new int[]{1, 4, 2});
    }
}




