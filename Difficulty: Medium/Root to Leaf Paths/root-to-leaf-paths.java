/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root)
    {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        path(root,arr1,arr);
        return arr;
        
        
    }
    public static void path(Node root,ArrayList<Integer> arr1,ArrayList<ArrayList<Integer>> arr)
    {
        if(root==null)
        {
            return;
        }
       
        arr1.add(root.data);
         if(root.left==null&&root.right==null)
        {
            arr.add(new ArrayList<>(arr1));
            arr1.remove(arr1.size()-1);
            return;
        }else
        {
        if(root.left!=null)
        {
            path(root.left,arr1,arr);

        }
        if(root.right!=null)
        {
            path(root.right,arr1,arr);
            
        }
                        arr1.remove(arr1.size()-1);
        }
        
        
        
    }
}