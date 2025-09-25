// User function Template for Java

class Solution {
    static int minHours(int N) {
        // code here
        int dp[]=new int[N+1];
        for(int i=0;i<N+1;i++)
        {
            dp[i]=-1;
        }
        int a=min(N,dp);
        return a<Integer.MAX_VALUE?a:-1;
    }
    static int min(int N,int dp[])
    {
        
        if(N==0)
        { return 0;
        }
        if(dp[N]!=-1)
        {
            return dp[N];
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        if(N>=10)
        {
           int     c=min(N-10,dp);
           if(c!=a)
           {
               a=1+c;
           }
        }
        if(N>=12)
        {
          int d=min(N-12,dp);
          if(d!=b)
          {
              b=1+d;
          }
        }
        
        return dp[N]=Math.min(a,b);
    }
}