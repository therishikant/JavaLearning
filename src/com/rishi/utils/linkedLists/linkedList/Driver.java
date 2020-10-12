package com.rishi.utils.linkedLists.linkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList<String> node = new LinkedList<String>();
        //LinkedList<String> node2 = new LinkedList<String>();
        node.PrintNode();
        node.AddNode("a");
        node.AddNode("b");
        node.AddNode("c");
        node.AddNode("d");
        node.DeleteNode("");
        node.DeleteNode("b");
        // node2.AddNode("n1a");
        // node2.AddNode("n2b");
        // node2.AddNode("n2c");
        // node.AddTwoNode(node2.GetHead());
        // node.AddNode("d");
        // node.AddNode("e");
        // node.DeleteNode("n2b");

        
        node.PrintNode();
    }
}
