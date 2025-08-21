/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) 
    {
        Node y=new Node(x);
        Node b=head;
         if(head==null)
         {
             
             return y;
         }
       
         while(b.next!=null)
         {
             b=b.next;
             
         }
         
        b.next=y;
        return head;
    }
}