/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class tuple
{
    int n;
    Node r;
    tuple(int n,Node r)
    {
        this.n=n;
        this.r=r;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        Map<Integer,Integer> map=new TreeMap<>();
         ArrayList<Integer> arr1=new ArrayList<>();
         if(root==null)
         {
             return arr1;
         }
        Queue<tuple> q=new LinkedList<>();
        tuple tr=new tuple(0,root);
        q.add(tr);
        while(!q.isEmpty())
        {
            for(int i=0;i<q.size();i++)
            {
                tuple t=q.poll();
                int ind=t.n;
                Node rt=t.r;
                map.put(ind,rt.data);
                if(rt.left!=null)
                {
                    tuple tv=new tuple(ind-1,rt.left);
                q.add(tv);
                }
                if(rt.right!=null)
                {tuple ts=new tuple(ind+1,rt.right);
                    q.add(ts);
                }
                
                
            }
        }
        ArrayList<Integer> arr=new ArrayList<>(map.keySet());
       
        
        for(int i:arr)
        {
            arr1.add(map.get(i));
        }
        return arr1;
        
    }
    
}