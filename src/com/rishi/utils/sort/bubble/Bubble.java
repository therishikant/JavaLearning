package com.rishi.utils.sort.bubble;

import com.rishi.utils.sort.Sorter;

public class Bubble extends Sorter {

    public Bubble(int[] arr) {
        super(arr);
        this.arr = arr;
    }

    @Override
    public void sort() {
        for (int i = 0 ; i < this.arr.length ; i++){
            for (int j = 0 ; j < this.arr.length -1; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
