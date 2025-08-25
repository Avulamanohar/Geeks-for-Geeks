/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head.next;
        head.next=head.prev;
        head.prev=temp;
        head=head.prev;
        while(head.next!=null)
        {
            Node t=head.next;
            head.next=head.prev;
            head.prev=t;
            head=head.prev;
        }
    
        Node t1=head.next;
        head.next=head.prev;
        head.prev=t1;
        return head;
        
    }
}