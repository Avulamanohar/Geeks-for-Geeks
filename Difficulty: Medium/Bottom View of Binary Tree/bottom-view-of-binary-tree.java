/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/
class tuple{
    Node node;
    int row;
    public tuple(Node node,int row)
    {
        this.node=node;
        this.row=row;
    }
}
class Solution {
    
    public ArrayList<Integer> bottomView(Node root)
    {
        Queue<tuple> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        if(root==null)
        {
            return arr;
        }
        q.add(new tuple(root,0));
        while(!q.isEmpty())
        {
            tuple t=q.poll();
            Node nod=t.node;
            int r=t.row;
            if(!map.containsKey(r))
            {
                map.put(r,0);
            }
           
                map.put(r,nod.data);
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