package com.bhaskar.utils;

public class Quick extends Sorter {

    public Quick(int[] arr) {
        super(arr);
    }

    @Override
    public void sort() {
        quickSort(0, arr.length - 1);

    }

    private void quickSort(int l, int r) {
        if (l < r) {
            int p = r;
            int less = l, more = p - 1;
            while (less != more) {
                if (arr[less] > arr[p]) {
                    int temp = arr[less];
                    arr[less] = arr[more];
                    arr[more] = temp;
                    more--;
                } else {
                    less++;
                }
            }
            if (arr[less] > arr[p]) {
                int temp = arr[less];
                arr[less] = arr[p];
                arr[p] = temp;
            }
            quickSort(l, p - 1);
            quickSort(p + 1, r);
        }
    }
}
