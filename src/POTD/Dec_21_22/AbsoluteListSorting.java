package POTD.Dec_21_22;

public class AbsoluteListSorting {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    private Node merge(Node sortedHead1, Node sortedHead2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while(sortedHead1 != null || sortedHead2 != null){
            if(sortedHead2 == null || (sortedHead1 != null && sortedHead1.data < sortedHead2.data)){
                temp.next = sortedHead1;
                sortedHead1 = sortedHead1.next;
            }
            else{
                temp.next = sortedHead2;
                sortedHead2 = sortedHead2.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
    private Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    Node sortList(Node head) {
        // Your code here
        if(head == null || head.next == null){
            return head;
        }
        Node mid = findMid(head);
        Node head2 = mid.next;
        mid.next = null;
        Node head1 = head;
        Node sortedHead1 = sortList(head1);
        Node sortedHead2 =sortList(head2);
        return merge(sortedHead1, sortedHead2);
    }
}
