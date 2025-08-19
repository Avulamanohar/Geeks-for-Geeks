/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/

class Solution {
    boolean isIdentical(Node root1, Node root2) 
    {
        if(root1==null && root2==null)
        {
            return true;
        }
      else  if(root1==null && root2!=null)
        {
            return false;
        }
       else if(root1!=null && root2==null)
        {
            return false;
        }
      else  if(root1.data!=root2.data)
        {
        return false;}
        
        return isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right);
        
    }
}