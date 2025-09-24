// User function Template for Java

class Solution {
    public int countWays(int n) {
        // code here
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
                dp[i]=-1;
            
        }
        return count(n,dp);
    }
    public int count(int n,int dp[] )
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=count(n-1,dp)+count(n-3,dp)+count(n-4,dp);
    }
};