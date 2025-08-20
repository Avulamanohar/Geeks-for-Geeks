/*
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> rightView(Node root) 
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        pre(root,arr,0);
        return arr;
    }
    void pre(Node root,ArrayList<Integer> arr,int ind)
    {
        if(root==null)
        {
            return;
        }
        if(arr.size()==ind)
        {
            arr.add(root.data);
        }
        pre(root.right,arr,ind+1);
        pre(root.left,arr,ind+1);
    }
}