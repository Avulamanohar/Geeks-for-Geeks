// User function Template for Java
/*class Node
{
    Node left;
    Node right;
    int data;
    Public Node(Node left,Node right,int data)
    {
        this.left=left;
        this.right=right;
        this.data=data;
    }
}*/
class Solution {
    public static void createTree(Node root0, ArrayList<Integer> v)
    {
     Node root=root0;
     root.left=new Node(v.get(1));
     root.right=new Node(v.get(2));
     root.left.left=new Node(v.get(3));
      root.left.right=new Node(v.get(4));
       root.right.left=new Node(v.get(5));
        root.right.right=new Node(v.get(6));
        
    }
    
    }
