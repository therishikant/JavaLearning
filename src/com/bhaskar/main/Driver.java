package com.bhaskar.main;

import com.bhaskar.utils.Heap;
import com.bhaskar.utils.Merge;
import com.bhaskar.utils.Quick;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
//        Heap heap = new Heap(arr);
//        heap.sort();
//        heap.printArray();

//        Merge merge = new Merge(arr);
//        merge.sort();
//        merge.printArray();

        Quick quick = new Quick(arr);
        quick.sort();
        quick.printArray();
    }
}
