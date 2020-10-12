package com.rishi.utils.linkedLists.linkedList;

public class Circular<TDataType> {
    private Node<TDataType> head = null;
    private Node<TDataType> tail = null;
    private Node<TDataType> currentNode = null;
    private Node<TDataType> previousNode = null;

    public void AddNode(TDataType data){
        Node<TDataType> node = new Node<TDataType>();
        node.SetData(data);
        node.SetNextNode(null);

        if(head == null){
            head = node;
            tail = node;
            node.SetNextNode(head);
            return;
        }else{
            tail.SetNextNode(node);
            tail = node;
            node.SetNextNode(head);
        }

    }

    public void DeleteNode(TDataType data){
        currentNode = head; 
        if(head == null){
            System.out.println("List is Empty");
            return; 
        }
        if(currentNode.GetData() == data){
            head = currentNode.getNextNode();
            tail.SetNextNode(head);
            return;
        }

        do{
            if(currentNode.GetData() == data){
                previousNode.SetNextNode(currentNode.getNextNode());
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        while(currentNode != head);
       
    }

    public void PrintNode(){
        currentNode = head;
        if(currentNode == null){
            System.out.println("null");
            return;
        }
        do{
            System.out.print(currentNode.GetData() + " --> ");
            currentNode = currentNode.getNextNode();
        }
        while(currentNode != head);
        
    }
}
