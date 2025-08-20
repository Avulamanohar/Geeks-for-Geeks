/*
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
    // Function to find the height of a binary tree.
    int b[]=new int[1];
    
    
    int height(Node node)
    {
        // code here
        this.b[0]=0;
        isheight(node,1);
        return b[0]-1;
    }
    void isheight(Node root,int count)
    {
        if(root==null)
        {
            return;
            
        }
        if(root.left==null&&root.right==null)
        {
            this.b[0]=Math.max(this.b[0],count);
            
        }
        count++;
        isheight(root.left,count);
        isheight(root.right,count);
        
    }
}