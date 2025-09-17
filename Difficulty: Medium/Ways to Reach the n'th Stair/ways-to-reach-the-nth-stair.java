class Solution {
    int countWays(int n) {
        // your code here
        int dp[]=new int [n];
        dp[0]=1;
        if(n==1)
        {
            return 1;
        }
        dp[1]=2;
        if(n==2)
        {
            return 2;
        }
        for(int i=2;i<n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
