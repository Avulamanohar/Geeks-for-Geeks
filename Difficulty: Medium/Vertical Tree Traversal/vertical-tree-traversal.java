/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class tuple
{
    int col;
    Node root;
    public tuple(int col,Node root)
    {
        
        this.col=col;
        this.root=root;
    }
}

class Solution {
    static ArrayList<ArrayList<Integer>> verticalOrder(Node root) 
    {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue<tuple> q=new LinkedList<>();
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        q.add(new tuple(0,root));
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                tuple b=q.poll();
                int c=b.col;
        
                Node rt=b.root;
                if(!map.containsKey(c))
                {
                    map.put(c,new ArrayList<>());
                }
               
                map.get(c).add(rt.data);
                if(rt.left!=null)
                {
                    q.add(new tuple(c-1,rt.left));
                }
                if(rt.right!=null)
                {
                    q.add(new tuple(c+1,rt.right));
                }
            }
            
        }
        for(ArrayList<Integer> p1:map.values())
        {    ArrayList<Integer> arr1=new ArrayList<>();

                for(int p3:p1)
                {
                    arr1.add(p3);
                }
            
            arr.add(arr1);
        }
        return arr;
    }
    
}