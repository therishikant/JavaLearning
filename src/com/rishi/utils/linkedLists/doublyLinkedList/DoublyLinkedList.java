package com.rishi.utils.linkedLists.doublyLinkedList;

public class DoublyLinkedList<TDataType> {

    private Node<TDataType> head = null;
    private Node<TDataType> currentNode = null;

    public void AddNode(TDataType data){
        Node<TDataType> node = new Node<TDataType>();
        
        node.setData(data);
        node.setNextNode(null);
        node.setPreviousNode(null);

        if(head == null){
            head = node;
            return;
        }
        currentNode = head;

        while(currentNode != null){
            if(currentNode.getNextNode() == null){
                currentNode.setNextNode(node);
                node.setPreviousNode(currentNode);
                return;
            }
            currentNode = currentNode.getNextNode();
        }

    }

    public void DeleteNode(TDataType data){
        currentNode = head;
        Node<TDataType> nextNode = null;
        Node<TDataType> previousNode = null;


        if(currentNode.getData() == data){
            head = null;
            return;
        }

        while(currentNode.getNextNode() != null){
            if(currentNode.getData() == data){
                if(currentNode.getNextNode() != null){
                    previousNode = currentNode.getPreviousNode();
                    previousNode.setNextNode(currentNode.getNextNode());
                    nextNode = currentNode.getNextNode();
                    nextNode.setPreviousNode(currentNode.getPreviousNode());
                    return;
                }
               
            }
            currentNode = currentNode.getNextNode();
        }
        if(currentNode.getData() == data){
            currentNode = currentNode.getPreviousNode();
            currentNode.setNextNode(null);
            return;
        }
        
        System.out.println("Data Not Found");
    }

    public void printNode(){
        currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.getData() + " --> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("null");
    }
}
