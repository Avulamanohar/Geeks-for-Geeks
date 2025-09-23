class Solution {
    public void reverseQueue(Queue<Integer> q) {
    
    int n=q.size();
    Stack<Integer> a=new Stack<>();
    for(int i=0;i<n;i++)
    {
      a.push(q.poll());
    
    }
    for(int i=0;i<n;i++)
    {
      q.add(a.pop());
    
    }
        
    }
}