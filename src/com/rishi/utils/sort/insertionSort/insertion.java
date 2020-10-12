package com.rishi.utils.sort.insertionSort;

import com.rishi.utils.sort.ISorter;

abstract class insertion<TDatatype> implements ISorter<TDatatype> {

    @Override
    public TDatatype sort(TDatatype[] arr) {
        integerSort<Integer> integerSort = new integerSort<Integer>();
        for(int i = 0; i < arr.length; i++){
            TDatatype k = arr[i];
            int j = i - 1;


        }
        return null;
    }


}
