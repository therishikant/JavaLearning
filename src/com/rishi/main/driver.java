package com.rishi.main;

import com.rishi.utils.sort.insertionSort.integerSort;

class driver{
    public static void main(String[] args) {

        Integer[] arr = {5,8,7,6,3,1,2};

        integerSort<Integer> integerSort = new integerSort<Integer>();

        System.out.println(integerSort.sort(arr));

    }
}