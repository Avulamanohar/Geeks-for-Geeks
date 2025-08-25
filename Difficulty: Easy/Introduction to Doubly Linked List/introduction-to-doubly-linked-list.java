// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        Node head=new  Node(arr[0]);
        Node t=head;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            Node temp=new Node(arr[i]);
            temp.prev=t;
            t.next=temp;
            t=temp;
        }
        
        return head;
    }
}