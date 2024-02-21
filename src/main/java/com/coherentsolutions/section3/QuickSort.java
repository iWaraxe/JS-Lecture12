package com.coherentsolutions.section3;

// Concrete Strategy 2
public class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] numbers) {
        // Quick sort algorithm
        System.out.println("Array sorted using Quick Sort");
    }
}
