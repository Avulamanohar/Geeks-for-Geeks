/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) 
    {
        return BST(root,0,Integer.MAX_VALUE);
    }
    boolean BST(Node root,int min ,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min||root.data>=max)
        {
           return false; 
        }
        return BST(root.left,min,root.data)&&BST(root.right,root.data,max);
    }
}