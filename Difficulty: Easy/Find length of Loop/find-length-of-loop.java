/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head)
    {
        Set<Node> ls=new HashSet<>();
        Node temp=null;
        while(head!=null)
        {
            if(ls.contains(head))
            {
                temp=head;
                break;
            }
            ls.add(head);
            head=head.next;
        }
        if(head==null)
        {
            return 0;
        }
        Node h=temp;
        temp=temp.next;
        int count=1;
        while(temp!=h)
        {
            count++;
            temp=temp.next;
        }
        return count;
        
    }
}