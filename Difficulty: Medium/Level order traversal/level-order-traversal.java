/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        if(root==null)
        {
            return arr;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
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
              arr.add(arr1);
        }
      return arr;
        
    }
}