package Topics.LinkedLists;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class PrintLinkedListElements {

    void display(Node head)
    {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
}
