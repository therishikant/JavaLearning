package com.rishi.utils.sort.merge;

import com.bhaskar.utils.Sorter;

public class Merge extends Sorter {

    public Merge(int[] arr) {
        super(arr);
        this.arr = arr;
    }

    @Override
    public void sort() {
        this.arr = mergeSort(0 , this.arr.length -1);
    }

    private int[] mergeSort(int l, int r) {
        if(l < r){
            int mid = (l + r)/2;
            int[] left = mergeSort(l,mid);
            int[] right = mergeSort(mid+1,r);
            return merge(left , right);
        }
        return new int[] { arr[l] };
    }

    private int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int l = 0, r = 0, m = 0;

        while (l < left.length && r < right.length){
            if( left[l] < right[r]){
                mergedArray[m] = left[l];
                l++;
            }else {
                mergedArray[m] = right[r];
                r++;
            }
            m++;
        }
        while (l < left.length){
            mergedArray[m] = left[l];
            l++;
            m++;
        }
        while (r < right.length){
            mergedArray[m] = right[r];
            r++;
            m++;
        }

        return mergedArray;
    }
}
