package Beginners_DSA_Sheet;

public class ReverseALinkedList {
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    //<!-- very Easy Code-->
    class Solution
    {
        //Function to reverse a linked list.
        Node reverseList(Node head)
        {
            if(head== null) return null;

            Node curr =head;
            Node prev = null;

            Node temp=head;

            while (curr!=null) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            return prev;
        }
    }

}
