// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    int findDist(Node root, int a, int b) {
        Node rot[]=new Node[1];
        find(root,a,rot);
        Set<Node> hs=new HashSet<>();
        Map<Node,Node> hm=new HashMap<>();
        parent(root,hm);
        int ab[]=new int[1];
      
        dist(rot[0],b,ab,hs,hm,0);
        return ab[0];
        
        
    }
    void parent(Node root,Map<Node,Node> map)
    {if(root==null)
    {
        return ;
    }
    if(root.left!=null)
    {
        map.put(root.left,root);
    }
     if(root.right!=null)
    {
        map.put(root.right,root);
    }
    parent(root.left,map);
    parent(root.right,map);
        
    }
    void find(Node root,int a,Node b[])
    {
        if(root==null)
        {
            return ;
        }
        if(root.data==a)
        {
            b[0]=root;
        }
        find(root.left,a,b);
        find(root.right,a,b);
    }
     void dist(Node root,int b,int a[],Set<Node> hs,Map<Node,Node> map,int k)
     {
         if(root==null)
         {
             return;
         }
         hs.add(root);
         if(root.data==b)
         {
          a[0]=k;   
         }
         if(root.left!=null&&!hs.contains(root.left))
         {
             dist(root.left,b,a,hs,map,k+1);
             
         }
          if(root.right!=null&&!hs.contains(root.right))
         {
             dist(root.right,b,a,hs,map,k+1);
             
         }
          if(map.get(root)!=null&&!hs.contains(map.get(root)))
         {
             dist(map.get(root),b,a,hs,map,k+1);
             
         }
     }
    
}