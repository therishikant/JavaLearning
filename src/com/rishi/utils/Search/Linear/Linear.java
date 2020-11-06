package com.rishi.utils.Search.Linear;

import com.rishi.utils.Search.Search;

public class Linear extends Search {

    public Linear(int[] arr) {
        super(arr);
    }

    @Override
    public void finder(int element) {
        for (int i = 0; i < arr.length; i++){
            if(element == arr[i]){
                System.out.println("Element: " +element+ " Found at index "+(i+1));
                return;
            }
        }
        System.out.println("Element Not Found");
    }
}
