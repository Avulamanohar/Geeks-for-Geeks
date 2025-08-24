/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
   
    Node binaryTreeToBST(Node root) {
    TreeSet<Integer> ts=new TreeSet<>(); 
    BST(root,ts);
    List<Integer> arr=new ArrayList<Integer>(ts);
    int a[]=new int[1];
     BT(root,arr,a);   
     return root;
    }
    void BST(Node root,TreeSet<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.data);
        BST(root.left,arr);
        BST(root.right,arr);
    }
    void BT(Node root,List<Integer> arr,int a[])
    {
        if(root==null)
        {
            return;
        }
        BT(root.left,arr,a);
        root.data=arr.get(a[0]);
        a[0]++;
        BT(root.right,arr,a);
    }
    
}