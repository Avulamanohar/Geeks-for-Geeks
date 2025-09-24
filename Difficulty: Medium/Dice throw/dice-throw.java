class Solution {
    static int noOfWays(int m, int n, int x) {
        // code here
        int dp[][]=new int[n+1][x+1];
        for(int j=0;j<n+1;j++)
        {
        for(int i=0;i<x+1;i++)
        {  
            
            dp[j][i]=-1;
        }}
    return ways(0,m,n,x,dp);    
    }
    static int ways(int ind,int m,int n,int x,int dp[][])
    {
      
        if(x<0)
        {
            return 0;
        }
        if(ind==n)
        {
              if(x==0)
        {
            return 1;
        }
            return 0;
        }
        if(dp[ind][x]!=-1)
        {
            return dp[ind][x];
        }
        int k=0;
        for(int i=1;i<=m;i++)
        {
           k+=ways(ind+1,m,n,x-i,dp); 
        }
        dp[ind][x]=k;
        return k;
    }
};