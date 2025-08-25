/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x)
    {   if(head.prev==null&&head.next==null)
    {
        return null;
    }
    int count=1;
    Node t=head;
    while(count!=x)
    {
        count++;
        head=head.next;
    }
      if(head.prev==null)
      {
          head.next.prev=null;
          head=head.next;
          return head;
      }
     else if(head.next==null)
      {
          head.prev.next=null;
      }
      else
      {
          head.prev.next=head.next;
          head.next.prev=head.prev;
      }
      return t;
        
    }
}