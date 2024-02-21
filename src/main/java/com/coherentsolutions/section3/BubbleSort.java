package com.coherentsolutions.section3;

// Concrete Strategy 1
public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] numbers) {
        // Bubble sort algorithm
        System.out.println("Array sorted using Bubble Sort");
    }
}
