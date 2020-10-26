package com.rishi.main;

import com.rishi.utils.sort.bubble.Bubble;
import com.rishi.utils.sort.insertion.InsertionSort;
import com.rishi.utils.sort.merge.Merge;

class driver{
    public static void main(String[] args) {

        int[] arr = {5,8,7,6,99,145,634,51,3,1,2};
//        InsertionSort insertionSort = new InsertionSort(arr);
//
//        insertionSort.sort(arr);
//        insertionSort.print();

//        Merge merge = new Merge(arr);
//        merge.sort();
//        merge.printArray();

        Bubble bubble = new Bubble(arr);
        bubble.sort();
        bubble.printArray();

    }
}