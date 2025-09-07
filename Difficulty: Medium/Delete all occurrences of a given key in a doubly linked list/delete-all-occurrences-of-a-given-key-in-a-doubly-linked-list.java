// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        while(head.data==x)
        {   head.next.prev=null;
            head=head.next;
        }
        if(head==null||head.next==null)
        {
            return head;
        }
        Node temp=head.next;
        while(temp.next!=null)
        {   if(temp.data==x)
        {
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
            temp=temp.next;
        }
        if(temp.data==x)
        {
          temp.prev.next=null;  
        }
        return head;
    }
}