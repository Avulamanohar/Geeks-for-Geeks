/*
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
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node temp=new Node(x);
        Node t=head;
        int count=0;
        while(count!=p)
        {
            head=head.next;
            count++;
        }
        temp.prev=head;
        if(head.next!=null)
        {
          temp.next=head.next;
          temp.next.prev=temp;  
        }
        
        
        else
        {
        temp.next=null;
        }
        temp.prev.next=temp;
       
      
        return t;
        
        
    }
}