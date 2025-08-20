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
    Node lca(Node root, int n1, int n2)
    {
      
          boolean b[]=new boolean[1];
          ArrayList<Node> arr=new ArrayList<>();
            ArrayList<Node> arr1=new ArrayList<>();
          Lca(root,n1,arr,b);
          b[0]=false;
           Lca(root,n2,arr1,b);
           int i,j;
           Node bf=null;
           for(i=0;i<arr.size();i++)
           {
               for(j=0;j<arr1.size();j++)
               {
                   if(arr.get(i).data==arr1.get(i).data)
                   {
                       bf=arr.get(i);
                   }
               }
           }
        return bf;
    }
  
    void Lca(Node root,int a,ArrayList<Node>arr, boolean b[])
    {
        if(b[0])
        {
            return ;
        }
        if(root==null)
        {
            return;
        } 
        arr.add(root);
        if(root.data==a)
        {
            b[0]=true;
            return;
        }
        Lca(root.left,a,arr,b);
        Lca(root.right,a,arr,b);
        if(!b[0])
        {
          arr.remove(arr.size()-1);  
        }
        
    }
    
}