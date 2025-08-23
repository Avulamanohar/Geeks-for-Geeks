/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public void toSumTree(Node root)
    {
       toSum(root);
       
    }
    public int toSum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        
       
    
          int l=toSum(root.left);;
          int r=toSum(root.right);
       
          int temp=root.data;
          root.data=l+r;
          return temp+l+r;
        
      
        
    }
}