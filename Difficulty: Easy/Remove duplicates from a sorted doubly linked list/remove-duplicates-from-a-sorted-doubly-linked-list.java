// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) 
    {
    if(head.next==null)
    {
        return head;
    }
    int n=head.data;
    Node temp=head;
    head=head.next;
    while(head.next!=null)
    {
        if(head.data==n)
        {
            head.prev.next=head.next;
            head.next.prev=head.prev;
        }
        else
        {
            n=head.data;
        }
        head=head.next;
    }
    if(head.data==n)
    {
        head.prev.next=null;
    }
    return temp;
    }
}