/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k)
    {
      List<Integer> arr=new ArrayList<>();
        kth(root,arr);
        return arr.get(k-1);
    }
    public void kth(Node root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        kth(root.right,arr);
        arr.add(root.data);
        kth(root.left,arr);
    }
}