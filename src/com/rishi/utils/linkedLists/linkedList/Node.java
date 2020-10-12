package com.rishi.utils.linkedLists.linkedList;

class Node<TDataType> {
    private TDataType data;
    private Node<TDataType> nextNode;

    public void SetData(TDataType data){
            this.data = data;
            
    }

    public void SetNextNode(Node<TDataType> node){
        this.nextNode = node;
    }
    
    public TDataType GetData(){
        return this.data;
    }

    public Node<TDataType> getNextNode(){
        return this.nextNode;
    }
}