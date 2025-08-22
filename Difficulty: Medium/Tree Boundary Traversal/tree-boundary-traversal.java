/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(node.data);
        if(node.left==null&&node.right==null)
        {
            return arr;
        }
        l(node.left,arr);
        leaf(node,arr);
        r(node.right,arr);
        return arr;
        
    }
    void l(Node root,ArrayList<Integer> arr)
    {
        
        if(root==null||root.left==null&&root.right==null)
        {
            return;
        }
         arr.add(root.data);
        if(root.left!=null)
        {
           
            l(root.left,arr);
        }
        else
        {
           l(root.right,arr);
        }
        
    }
        
         void r(Node root,ArrayList<Integer> arr)
    {
        
        if(root==null||root.left==null&&root.right==null)
        {
            return;
        }
        
        if(root.right!=null)
        {
           
            r(root.right,arr);
        }
        else
        {
           r(root.left,arr);
        }
         arr.add(root.data);
    }
    void leaf(Node root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right==null)
        {
            arr.add(root.data);
        }
        leaf(root.left,arr);
        leaf(root.right,arr);
    }
}