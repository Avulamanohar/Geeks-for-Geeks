class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        boolean b[]=new boolean[V+1];
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            ar.get(edges[i][0]).add(edges[i][1]);
            ar.get(edges[i][1]).add(edges[i][0]);
        }
         ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
         
        for(int i=0;i<V;i++)
        {   ArrayList<Integer> arr=new ArrayList<>();
            if(!b[i])
            { 
               
                
                dfs(i,ar,arr,b);
                arr1.add(new ArrayList<>(arr));
            }
        }
        return arr1;
    }
    public void dfs(int i,ArrayList<ArrayList<Integer>> a,ArrayList<Integer> arr,boolean b[])
    {
        if(b[i])
        {
            return;
        }
        b[i]=true;
        arr.add(i);
        for(int j=0;j<a.get(i).size();j++)
        {

        if(!b[a.get(i).get(j)])
         dfs(a.get(i).get(j),a,arr,b);
        }
        
    }
}