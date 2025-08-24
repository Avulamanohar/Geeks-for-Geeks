/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class BST {
   
    boolean search(Node root, int x) 
    {if(root==null)
    {
        return false;
    }
    if(root.data==x)
    {
        return true;
    }
    if(root.data>x)
    {
        return search(root.left,x);
    }
   else if(root.data<x)
    {
        return search(root.right,x);
    }
        
        return true;
    }
}