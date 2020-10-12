package com.rishi.utils.linkedLists.doublyLinkedList;

public class DoublyCircular<TDataType> {
    
    private Node<TDataType> head = null;
    private Node<TDataType> tail = null;
    private Node<TDataType> currentNode = null;

    public void AddNode(TDataType data){
        Node<TDataType> node = new Node<TDataType>();
        
        node.setData(data);
        node.setNextNode(null);
        node.setPreviousNode(null);

        if(head == null){
            head = node;
            tail = node;
            node.setNextNode(head);
            return;
        }else{
            tail.setNextNode(node);
            node.setPreviousNode(tail);
            tail = node;
            node.setNextNode(head);
        }

    }

    public void DeleteNode(TDataType data){
        currentNode = head;
        Node<TDataType> nextNode = null;
        Node<TDataType> previousNode = null;
        if(head == null){
            System.out.println("Data Not Found");
            return;
        }

        if(head.getData() == data){
            tail.setNextNode(head.getNextNode());
            head = head.getNextNode();
            head.setPreviousNode(tail);
            return;
        }
        if(tail.getData() == data){
            head.setPreviousNode(tail.getPreviousNode());
            tail = tail.getPreviousNode();
            tail.setNextNode(head);
            return;
        }

        do{
            {
                if(currentNode.getData() == data){
                        previousNode = currentNode.getPreviousNode();
                        previousNode.setNextNode(currentNode.getNextNode());
                        nextNode = currentNode.getNextNode();
                        nextNode.setPreviousNode(currentNode.getPreviousNode());
                        return;
                }
                currentNode = currentNode.getNextNode();
            }
        }

        while(currentNode.getNextNode() != head);
        
        System.out.println("Data Not Found");
    }

    public void printNode(){
        currentNode = head;
        if(currentNode == null){
            System.out.println("List Is Empty");
        }
        do{
            System.out.print(currentNode.getData() + " --> ");
            currentNode = currentNode.getNextNode();
        }
        while(currentNode != head);
        System.out.println("");
    }
}
