class Solution {

    int[] Series(int n) {
        // cod here
        int dp[]=new int[n+1];
        
        for(int i=0;i<n+1;i++)
        {
            dp[i]=-1;
        
        }
        dp[0]=0;
        dp[1]=1;
        fib(n,dp);
      
        return dp;
    }
    int fib(int n,int dp[])
    {   
        if(n==1||n==0 )
        {  
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
       dp[n]=(fib(n-1,dp)+fib(n-2,dp))%(int)(1e9+7);
       return dp[n];
    }
}