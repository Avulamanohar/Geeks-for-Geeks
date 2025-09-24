
class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        int a[]=new int[2];
        a[0]=1;
        a[1]=2;
        long dp[][]=new long[2][n+1];
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<n+1;j++)
        {
            dp[i][j]=-1;
        }}
        
        return count(0,0,a,n,dp);
    }
    Long count(int s,int ind,int a[],int n,long dp[][])
    {
        if(s>1)
        {
            return (long)0;
        }
        if(ind ==n)
        {
            return (long)1;
        }
        if(dp[s][ind]!=-1)
        {
            return dp[s][ind];
        }
        long ar=count(s+1,ind,a,n,dp);
        long b=0;
        if(ind+a[s]<=n)
        {
         b=count(s,ind+a[s],a,n,dp);
        }
        return dp[s][ind]=ar+b;
    }
}
