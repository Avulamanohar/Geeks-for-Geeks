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
import java.util.*;
class Solution {
    ArrayList<Integer> boundaryTraversal(Node node)
    {
       ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(node.data);
        Left(arr,node.left);
        Leaf(arr,node.left);
        Leaf(arr,node.right);

        
        ArrayList<Integer>arr2=new ArrayList<Integer>();
        Right(arr2,node.right);
        Collections.reverse(arr2);
         arr.addAll(arr2);
         return arr;
        
        
        
        
    }
    
    public void Left(ArrayList<Integer> arr,Node node)
    {
        if(node==null ||(node.left==null&&node.right==null))
        {
            return;
        }
        
        
        arr.add(node.data);
        
        if(node.left!=null)
        {
            
            Left(arr,node.left);
        }
        else
        {
            Left(arr,node.right);
        }
    }
    public void Leaf(ArrayList<Integer> arr,Node node)
    {
        if(node==null)
        {
            return;
        }
        if(node.left==null&&node.right==null)
        {
        arr.add(node.data);
        }
        Leaf(arr,node.left);
        Leaf(arr,node.right);
    }
    public void Right(ArrayList<Integer> arr,Node node)
    {
        if(node==null ||(node.left==null&&node.right==null))
        {
            return;
        }
        
        
        arr.add(node.data);
        
        if(node.right!=null)
        {
            
            Right(arr,node.right);
        }
        else 
        {
            Right(arr,node.left);
        }
        
    }
}