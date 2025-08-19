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
}
*/
class Solution {
    public ArrayList<Integer> findSpiral(Node root) {
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty())
        {
           
            int n=q.size();
              ArrayList<Integer> arr1=new ArrayList<>();
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
                 arr1.add(r.data);
                 
                
            }
            if(count%2==0)
            {
                Collections.reverse(arr1);
            }
            count++;
            for(int k:arr1)
            {
                arr.add(k);
            }
            
            
        }
        return arr;
        
    }
}