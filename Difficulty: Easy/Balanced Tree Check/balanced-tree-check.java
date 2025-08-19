/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
      boolean b[]=new boolean[1]; 
      b[0]=true;
      Bal(root,b);
      
      return b[0];
        
    }
    public int Bal(Node root,boolean b[])
    {
        if(root==null)
        {
            return 0;
        }
        int l=Bal(root.left,b);
        int r=Bal(root.right,b);
        if(Math.abs(l-r)>1)
        {
           b[0]=false; 
        }
        return 1+Math.max(l,r);
    }
    
}