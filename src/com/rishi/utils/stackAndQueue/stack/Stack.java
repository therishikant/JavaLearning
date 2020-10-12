package com.rishi.utils.stackAndQueue.stack;

class Stack {
    
    private final static int MAX_STACK_ELEMENT = 100;
    private static int totalElement = 0;
    private static char[] stackArray = new char[MAX_STACK_ELEMENT];

    public static void push(char element) {
        try {
            if (totalElement <= 99) {
                stackArray[totalElement] = element;
                totalElement++;
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
        
    }

    public void pop(){
        try{
            if(totalElement >= 1){
                totalElement--;
                System.out.println(stackArray[totalElement-1]);
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
        
    }

    public char peek(){
        
        try{
            if(totalElement > 0 ){  
                return stackArray[totalElement-1];
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
        return 0;
        
    }

    public void printStack(){
        System.out.println("Total Element : "+ totalElement);
        for(int i = totalElement - 1; i >= 0 ; i--){
            System.out.println(stackArray[i]);
        }
    }
}
