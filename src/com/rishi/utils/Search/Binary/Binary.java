package com.rishi.utils.Search.Binary;

import com.rishi.utils.Search.Search;
import com.rishi.utils.sort.bubble.Bubble;

public class Binary extends Search {

    private int call =0;
    private boolean flag = false;
    public Binary(int[] arr) {
        super(arr);
    }

    @Override
    public void finder(int element) {
        Bubble bubble = new Bubble(arr);
        arr = bubble.getSortedArry();
        binarySearch(0,arr.length-1, element);
        if(flag){
            System.out.println("Element Found");
            System.out.println(call);
        }else{
            System.out.println("Element Not Found");
            System.out.println(call);
        }
    }
    private void  binarySearch(int locLeft,int locRight, int element){
        call++;
        int locMid = (locLeft+locRight)/2;
        if(arr[locMid] == element){
            flag = true;

        }else if(arr[locMid] > element && locLeft != locMid){
            binarySearch(locLeft,locMid-1,element);

        }else if(arr[locMid] < element && locMid != locRight){
            binarySearch(locMid+1,locRight,element);
        }
    }
}
