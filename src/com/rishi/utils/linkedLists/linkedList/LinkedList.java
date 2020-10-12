package com.rishi.utils.linkedLists.linkedList;

public class LinkedList<TDataType> {

    private Node<TDataType> head = null;
    private Node<TDataType> currentNode = null;
    private Node<TDataType> prevoiusNode = null;

    public void AddNode(TDataType data){
        
        Node<TDataType> node = new Node<TDataType>();
        node.SetData(data);
        node.SetNextNode(null);

        if(head == null){
            head = node;
            return;
        }

        currentNode = head;

        while (currentNode != null){
            if(currentNode.getNextNode() == null){
                currentNode.SetNextNode(node);
                currentNode = null;
                return;
            }
            
            currentNode = currentNode.getNextNode();
        }
    }

    public void DeleteNode(TDataType data){
        
        currentNode = prevoiusNode = head; 
        if(currentNode.GetData() == data){
            head = currentNode.getNextNode();
            return;
        }
        while(currentNode != null){
            if(currentNode.GetData() == data){
                // set previous node nextNode to next node 
                currentNode = currentNode.getNextNode();
                prevoiusNode.SetNextNode(currentNode);
                return;
            }
            prevoiusNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Element Not found");
    }

    public void SearchData(TDataType data){
        currentNode = head;
        int index = 0;
        while(currentNode != null){
            
            if(currentNode.GetData() == data){
                System.out.println("Data Is Present At Index : "+index);
                return;
            }
            currentNode = currentNode.getNextNode();
            index++;
        }
        System.out.println("Data Not Present");
    } 

    public void SetNewData(TDataType oldData, TDataType data){
        currentNode = head;
        int index = 0;
        while(currentNode != null){
            if(currentNode.GetData() == oldData){
                currentNode.SetData(data);
                System.out.println("Data Found At Index : ["+ index + "] New Data Changed To : "+data);
                return;
            }
            index++;
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Data Not Found ");
    }

    public void SetDataAtIndex(int dataIndex, TDataType data){
        currentNode = head;
        int index = 0;
        while(currentNode != null){
            if(index == dataIndex){
                currentNode.SetData(data);
                System.out.println("Index Found New Data set To :" + data);
                return;
            }
            index++;
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Index Not Found");
    }

    public void AddTwoNode(Node<TDataType> newNodeHead){
        currentNode = head;
        while(currentNode != null){
            if(currentNode.getNextNode() == null){
                currentNode.SetNextNode(newNodeHead);
                return;
            }
            currentNode = currentNode.getNextNode();
        }
    }

    public Node<TDataType> GetHead(){
        Node<TDataType> headValue = head;
        return headValue;
    }

    public void PrintNode(){
        currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.GetData() + " --> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("null");
    }

}
