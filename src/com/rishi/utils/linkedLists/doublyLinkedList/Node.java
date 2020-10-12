package com.rishi.utils.linkedLists.doublyLinkedList;

public class Node<TDataType> {
    
    private TDataType data;
    private Node<TDataType> nextNode;
    private Node<TDataType> previousNode;

    public void setData(TDataType data){
        this.data = data;
    }

    public void setNextNode( Node<TDataType> nextNode){
        this.nextNode = nextNode;
    }

    public void setPreviousNode( Node<TDataType> previousNode){
        this.previousNode = previousNode;
    }

    public TDataType getData(){
        return this.data;
    }

    public Node<TDataType> getNextNode(){
        return this.nextNode;
    }

    public Node<TDataType> getPreviousNode(){
        return this.previousNode;
    }
    
}
