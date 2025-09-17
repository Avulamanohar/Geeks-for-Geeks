// User function Template for Java

class Solution {
    // Function to count the number of ways in which frog can reach the top.
    static int countWays(int n) {
        int dp[]=new int[n];
        dp[0]=1;
        if(n==1)
        {
            return dp[0];
        }
        dp[1]=2;
        if(n==2)
        {return dp[1];}
        dp[2]=4;
        if(n==3)
        {
            return dp[2];
        }
        for(int i=3;i<n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n-1];
    }
}
