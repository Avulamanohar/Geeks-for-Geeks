// User function Template for Java

class Solution {
    public static int ways(int n, int m) {
     int dp[][]=new int[n+1][m+1];
     for(int i=0;i<=n;i++)
     {
         for(int j=0;j<=m;j++)
         {
             dp[i][j]=-1;
         }
     }
     return count(n,m,dp);
    }
    public static int count(int n,int m,int dp[][])
    {
        if(n<0||m<0)
        {
            return 0;
        }
        if(n==0&&m==0)
        {
            return 1;
        }
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
        return dp[n][m]=(count(n-1,m,dp)+count(n,m-1,dp))%(int)(1e9+7);
    }
}