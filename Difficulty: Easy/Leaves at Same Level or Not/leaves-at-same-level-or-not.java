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
    
    boolean check(Node root)
    { 
        HashSet<Integer> arr=new HashSet<>();
        check(root,arr,1);
        if(arr.size()==1)
        {
            return true;
        }
        return false;
    }
    void check(Node root,HashSet<Integer> hs,int count)
    
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            hs.add(count);
            return;
        }
        check(root.left,hs,count+1);
         check(root.right,hs,count+1);
        
        
    }
}