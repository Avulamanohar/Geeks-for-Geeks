// User function Template for Java

class Solution {
    public long lucas(int n) {
        // code here.
        long dp[]=new long[n+1];
        for(int i=0;i<n+1;i++)
        {
         dp[i]=-1;   
        }
        dp[0]=2;
        dp[1]=1;
        for(int i=2;i<n+1;i++)
        {
            dp[i]=(dp[i-1]+dp[i-2])%(int)(1e9+7);
        }
        return dp[n];
        
    }
};
