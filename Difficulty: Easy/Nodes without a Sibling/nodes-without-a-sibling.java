/*  A Binary Tree nodea
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
class Tree {
    ArrayList<Integer> noSibling(Node node) {
        // code here
        Set<Integer> ts=new TreeSet<>();
        
        sib(node,ts);
        ArrayList<Integer> arr=new ArrayList<>(ts);
        if(arr.size()==0)
        {
            arr.add(-1);
        }
        return arr;
    }
    void sib(Node root,Set<Integer> hs)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null&&root.right!=null)
        {
          hs.add(root.right.data);  
        }
       else  if(root.left!=null&&root.right==null)
        {
          hs.add(root.left.data);  
        }
        sib(root.left,hs);
        sib(root.right,hs);
    }
}