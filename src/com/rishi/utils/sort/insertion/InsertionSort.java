package com.rishi.utils.sort.insertion;

public class InsertionSort {
    int[] arr;

    public InsertionSort(int[] arr){
        this.arr = arr;
    }

    public void print(){
        for(int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void sort(int arr[]){
        for(int i =1; i<arr.length; i++){

            int k = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > k){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = k;

        }
    }
}
