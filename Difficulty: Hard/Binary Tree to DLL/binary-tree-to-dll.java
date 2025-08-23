/*
class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/
class Solution {
    Node bToDLL(Node root)
    {
        List<Node> arr=new ArrayList<>();
        DLL(root,arr);
        Node head=arr.get(0);
        head.left=null;
        head.right=null;
        Node temp=head;
        int n=arr.size();
        for(int i=1;i<n;i++)
        {
           Node curr=arr.get(i);
           Node prev=arr.get(i-1);
            curr.left=prev;
            curr.right=null;
            prev.right=curr;
            
            
        }
        return head;
        
    }
    void DLL(Node root,List<Node> arr)
    {
        if(root==null)
        {
            return;
        }
        DLL(root.left,arr);
        arr.add(root);
        DLL(root.right,arr);
    }
}