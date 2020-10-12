package com.rishi.utils.stackAndQueue.queufile;

class Entery {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.printArray();
        System.out.println("x");
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("Final Array");
        queue.printArray();
    }
}
