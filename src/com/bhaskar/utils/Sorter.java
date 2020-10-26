package com.bhaskar.utils;

public abstract class Sorter {

    int arr[];

    public Sorter(int[] arr) {
        this.arr = arr;
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }

    public abstract void sort();


}
