package com.rishi.utils.stackAndQueue.stack;

public class Brackets {
    private char openingBrackets[] = { '[', '{', '(' };
    private char closingBrackets[] = { ']', '}', ')' };

    Stack stack = new Stack();

    public void checkBrackets(String characterSet) {
        char peekedCharacter;
        char character;
        for (int i = 0; i < characterSet.length(); i++) {
            character = characterSet.charAt(i);

            if(character == openingBrackets[0] ||
            character == openingBrackets[1] ||
            character == openingBrackets[2]){
                stack.push(character);
            }

            else if(character == ']' || character == '}' || character == ')'){
                peekedCharacter = (char) stack.peek();
                if(checkIfBracketIsSame(character, peekedCharacter)) {
                    stack.pop();
                }
            }
    }
    
    if(stack.peek() == 0){
        System.out.println("Valid");
    }else{
        System.out.println("Not Valid");
    }
}
    public boolean checkIfBracketIsSame(char a, char b){
        int positionA = -1, positionB = -2;
        for(int i =0; i<3; i++){
            if(openingBrackets[i] == b){
                positionA = i;
            }if(closingBrackets[i] == a){
                positionB = i;
            }
        }
        
        if(positionA == positionB){
            return true;
        }else{
            return false;
        }
        
    }

}
