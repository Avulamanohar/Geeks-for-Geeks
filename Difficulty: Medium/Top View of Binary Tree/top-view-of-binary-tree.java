/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class tuple
{
    Node node;
    int row;
    public tuple(Node node,int row)
    {
        this.node=node;
        this.row=row;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        TreeMap<Integer,Integer> map =new TreeMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue<tuple> q=new LinkedList<>();
        q.add(new tuple(root,0));
        while(!q.isEmpty())
        {
          tuple t=q.poll();
          Node nod=t.node;
          int r=t.row;
          if(!map.containsKey(r))
          {
              map.put(r,nod.data);
          }
          if(nod.left!=null)
          {
              q.add(new tuple(nod.left,r-1));
          }
          if(nod.right!=null)
          {
              q.add(new tuple(nod.right,r+1));
          }
        }
        
  for(int k:map.values())
  {
      arr.add(k);
  }
  return arr;
       
    }
   
      
       
    
}