package com.bhaskar.utils;

public class Heap {
    private int[] arr;
    private int heapSize;

    public Heap(int[] arr) {
        this.arr = arr;
        heapSize = arr.length;
        buildMaxHeap();
    }

    private int leftChild(int i) {
        return 2*i + 1;
    }

    private int rightChild(int i) {
        return 2*(i + 1);
    }

    private void buildMaxHeap() {
        int startIndex =  heapSize/2 - 1;
        for (int i = startIndex; i >= 0; i--) {
            heapify(i);
        }
    }

    private void heapify(int i) {
        int maxIndex = i;
        int indexOfLeftChild = leftChild(i);
        int indexOfRightChild = rightChild(i);

        if (indexOfLeftChild < heapSize && arr[indexOfLeftChild] > arr[maxIndex]) {
            maxIndex = indexOfLeftChild;
        }
        if (indexOfRightChild < heapSize && arr[indexOfRightChild] > arr[maxIndex]) {
            maxIndex = indexOfRightChild;
        }

        if (maxIndex == i) {
            return;
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[i];
        arr[i] = temp;
        heapify(maxIndex);
    }

    public void printHeap() {
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }
    }

    public void sort() {
        for (int i = 0; i < arr.length; i ++) {
            int temp = arr[0];
            arr[0] = arr[heapSize - 1];
            arr[heapSize - 1] = temp;
            heapSize --;
            heapify(0);
        }
    }
}
