// User function Template for Java

class Solution {
    public int nthPoint(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        }

      return nth(n,dp);  
    }
    public int nth(int n,int dp[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
       
        int c=nth(n-1,dp);
        int d=nth(n-2,dp);
        
        
        
        return dp[n]=(c+d)%(int)(1e9+7);
        
    }
}