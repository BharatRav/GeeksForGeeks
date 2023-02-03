package Beginners_DSA_Sheet;

public class DeleteANodeInSingleLinkedList {
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node deleteNode(Node head, int x)
    {
        // Your code here
        Node curr =head;
        if(x==1){
            head= head.next;
        }

        int count=1;
        while(count++<x-1) {
            curr= curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
