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
}*/
class Solution {
    ArrayList<Integer> leftView(Node root) 
    {ArrayList<Integer> arr=new ArrayList<>();
    
        // code her
        leftV(root,0,arr);
        return arr;
        
    }
    void leftV(Node root,int ind,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
            
        }
        if(arr.size()==ind)
        {
            arr.add(root.data);
        }
        leftV(root.left,ind+1,arr);
        leftV(root.right,ind+1,arr);
        
    }
}