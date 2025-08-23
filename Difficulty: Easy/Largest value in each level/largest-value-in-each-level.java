// User function Template for Java

class Solution {
    public ArrayList<Integer> largestValues(Node root)
    {
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      ArrayList<Integer> arr1=new ArrayList<>();
      while(!q.isEmpty())
      {
          PriorityQueue<Integer> arr=new PriorityQueue<>(Collections.reverseOrder());
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
              arr.add(r.data);
          }
          arr1.add(arr.poll());
      }
      return arr1;
        
    }
}