package com.rishi.utils.stackAndQueue.queue;

import java.util.*;


class Queue {
    private List<Integer> array = new ArrayList<Integer>();

    public void push(int element){
        array.add(element);
    }

    public void pop(){
        array.remove(0);
    }

    public int peek(){
        
        return array.get(array.size()-1);
    }

    public void printArray(){
        for(int i =0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
    }
} 