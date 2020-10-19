package com.rishi.main;

import com.rishi.utils.heap.Heap;
import com.rishi.utils.sort.insertionSort.InsertionSort;

class driver{
    public static void main(String[] args) {

        int[] arr = {5,8,7,6,99,145,634,51,3,1,2};
        InsertionSort insertionSort = new InsertionSort(arr);

        insertionSort.sort(arr);
        insertionSort.print();

    }
}