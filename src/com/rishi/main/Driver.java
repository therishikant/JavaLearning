package com.rishi.main;

import com.bhaskar.utils.Quick;
import com.rishi.utils.sort.bubble.Bubble;
import com.rishi.utils.sort.insertion.InsertionSort;
import com.rishi.utils.sort.merge.Merge;

class Driver {
    public static void main(String[] args) {

        int[] arr = {9,5,7,2,4,3,10,11};
//        InsertionSort insertionSort = new InsertionSort(arr);
//
//        insertionSort.sort(arr);
//        insertionSort.print();

        Merge merge = new Merge(arr);
        merge.sort();
        merge.printArray();

//        Bubble bubble = new Bubble(arr);
//        bubble.sort();
//        bubble.printArray();

        Quick quick = new Quick(arr);
        quick.sort();
        quick.printArray();
    }
}