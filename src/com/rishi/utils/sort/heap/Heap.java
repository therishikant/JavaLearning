package com.rishi.utils.sort.heap;

public class Heap {
    int[] arr;
    int heapSize;

    public Heap(int[] arr){
        this.arr = arr;
        heapSize = arr.length;
        buildMaxHeap();
    }

    private int getLeftIndex(int i){
        return 2*i +1;
    }

    private int getRightIndex(int i) {
        return 2*(i+1);
    }

    private void buildMaxHeap() {
        int startIndex = heapSize/2 -1;
        for(int i = startIndex ; i >= 0; i--){
            heapify(i);
        }
    }

    private void heapify(int i) {
        int maxIndex = i;
        int leftIndex = getLeftIndex(i);
        int rightIndex = getRightIndex(i);

        if(leftIndex < heapSize && arr[leftIndex] > arr[maxIndex]){
            maxIndex = leftIndex;
        }

        if(rightIndex < heapSize && arr[rightIndex] > arr[maxIndex]){
            maxIndex = rightIndex;
        }

        if(maxIndex == i){
            return;
        }

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[i];
        arr[i] = temp;
        heapify(maxIndex);

    }

    public  void  printArr(){
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public  void sort(){
        for (int i = 0 ; i<arr.length ; i++){
            int temp = arr[0];
            arr[0] = arr[heapSize-1];
            arr[heapSize-1] = temp;
            heapSize--;
            heapify(0);
        }
    }

}
