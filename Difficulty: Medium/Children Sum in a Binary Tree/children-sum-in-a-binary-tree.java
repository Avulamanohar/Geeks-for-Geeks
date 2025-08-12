/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) 
    {
      if(root==null)
      {
          return true;
      }
      boolean b[]=new boolean[1];
        b[0]=true;
        isSum(root,b);
        return b[0];
    }
    public int isSum(Node root,boolean b[])
    {
        
    if(root==null)
    {
     return 0;   
    }
    if(root.left!=null||root.right!=null)
    {
        
    
    
     int sum=isSum(root.left,b)+isSum(root.right,b);
     if(sum!=root.data)
     {
         b[0]=false;
     }}
     return root.data;
     
    }
        
    }