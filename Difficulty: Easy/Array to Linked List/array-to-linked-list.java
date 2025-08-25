/*
// Representation of a node
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        Node head=new Node(arr[0]);
        Node t=head;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            Node temp=new Node(arr[i]);
            head.next=temp;
            head=temp;
        }
        return t;
        
    }
}
