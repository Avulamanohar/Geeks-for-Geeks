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

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
    ArrayList<Integer> arr=new ArrayList<>();
     ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
     if(root==null)
     {
         return arr;
     }
     Queue<Node> q=new LinkedList<>();
     q.add(root);
     while(!q.isEmpty())
     {   ArrayList<Integer> arr2=new ArrayList<>();
         int n=q.size();
         for(int i=0;i<n;i++)
         {
           Node t=q.poll();
           if(t.left!=null)
           {
               q.add(t.left);
           }
           if(t.right!=null)
           {
               q.add(t.right);
           }
          
          arr2.add(t.data);
         }
          arr1.add(arr2);
     }
     Collections.reverse(arr1);
     for(ArrayList<Integer> k:arr1)
     {
        for(int f:k)
        {
            arr.add(f);
        }
     }
     return arr;
        
    }
}