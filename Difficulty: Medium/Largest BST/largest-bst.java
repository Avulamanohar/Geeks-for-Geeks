// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {


    static int largestBst(Node root)
    {
      List<Node> arr=new ArrayList<>();
      large(root,arr);
      List<Node> arr1=new ArrayList<>();
      for(int i=0;i<arr.size();i++)
      {
          boolean b=BST(arr.get(i),0,100001);
          if(b)
          {
              arr1.add(arr.get(i));
          }
      }
      int n=arr1.size();
      int m=0;
      for(int i=0;i<n;i++)
      {
          int a=Nod(arr1.get(i));
          m=Math.max(a,m);
          
      }
      return m;
      
      
        
    }
    static void large(Node root,List<Node> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root);
        large(root.left,arr);
        large(root.right,arr);
    }
    static boolean BST(Node root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min||root.data>=max)
        {
            return false;
        }
        return BST(root.left,min,root.data)&&BST(root.right,root.data,max);
    }
    static int Nod(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int l=Nod(root.left);
        int r=Nod(root.right);
        return 1+l+r;
        
        
    }
    
}