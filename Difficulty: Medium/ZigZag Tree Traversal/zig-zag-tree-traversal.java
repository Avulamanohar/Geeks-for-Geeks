/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty())
        {
            ArrayList<Integer> arr2=new ArrayList<>(); 
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                Node r=q.poll();
                if(r.left!=null)
                {
                    q.add(r.left);
                }
                  if(r.right!=null)
                {
                    q.add(r.right);
                }
                arr2.add(r.data);
            }
            if(count%2==1)
            {
                Collections.reverse(arr2);
            }
            count++;
            arr1.add(arr2);
            
        }
        for(ArrayList<Integer> p:arr1)
        {
            for(int f:p)
            {
                arr.add(f);
            }
        }
        return arr;
        
        // code here.
    }
}