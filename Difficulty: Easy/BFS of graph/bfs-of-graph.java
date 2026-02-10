class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Integer> st=new LinkedList<>();
        st.add(0);
        
        boolean b[]=new boolean[n+1];
        b[0]=true;
        while(!st.isEmpty())
        {
           int a=st.poll();
           arr.add(a);
           for(int i=0;i<adj.get(a).size();i++)
           {
               int k=adj.get(a).get(i);
               if(!b[k])
               {
                   st.add(k);
                   b[k]=true;
               }
           }
        }
        return arr;
    }
}