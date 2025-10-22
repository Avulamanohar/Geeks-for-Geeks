class Solution {
    public ArrayList<Integer> prefixSum2D(int[][] mat, int[][] queries)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=1;j<mat[0].length;j++)
            {
                mat[i][j]+=mat[i][j-1];
            }
        }
        for(int j=0;j<mat[0].length;j++)
        {
            for(int i=1;i<mat.length;i++)
            {
                mat[i][j]+=mat[i-1][j];
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0;i<queries.length;i++)
        {   
             int a=queries[i][0];
             int b=queries[i][1];
             int c=queries[i][2];
             int d=queries[i][3];
             int sum=mat[c][d];
             if(a-1>=0)
             {
                 sum-=mat[a-1][d];
             }
             if(b-1>=0)
             {
                 sum-=mat[c][b-1];
             }
             if(a-1>=0&&b-1>=0)
             {
                 sum+=mat[a-1][b-1];
             }
             arr.add(sum);
        }
        return arr;
        
    }
}
