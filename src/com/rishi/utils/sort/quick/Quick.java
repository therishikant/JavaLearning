package com.rishi.utils.sort.quick;

import com.rishi.utils.sort.Sorter;

public class Quick extends Sorter {
    public Quick(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        quickSort(arr,0,arr.length-1);
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l<r){
            int pivotLoc = partition(arr, l , r);
            quickSort(arr, l, pivotLoc-1);
            quickSort(arr, pivotLoc+1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r/2];
        int start = l;
        int end = r;

            while (arr[start] <= pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if(start < end){
                swap(arr[start], arr[end]);
            }

        swap(arr[l],arr[end]);
        return r;
    }

    private void swap(int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
