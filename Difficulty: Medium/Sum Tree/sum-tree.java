/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) 
    {
        // Your code here
       boolean b[]=new boolean[1];
       b[0]=true;
       hi(root,b);
       return b[0];
    }
    int hi(Node root,boolean b[])
    { 
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return root.data;
        }
          
        int l= hi(root.left,b);
        int r=  hi(root.right,b);
         if(root.data!=l+r)
         {
             b[0]=false;
         }
        
        return root.data+l+r;
       
       
    }
}