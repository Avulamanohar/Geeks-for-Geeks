// User function Template for Java

class Solution {
    public int minOperation(int n) {
        int dp[]=new int[n+1];
        int a=0;
        while(n!=0)
        {
            if(n%2==0)
            {
            n=n/2;
            }
            else
            {
                n=n-1;
            }
            a++;
        }
        return a;
    }
    public int oper(int i,int n,int dp[])
    {
        if(i>n)
        {
            return Integer.MAX_VALUE;
        }
        if(i==n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int d=oper(i*2,n,dp);
        int c=oper(i+1,n,dp);

       
        return dp[i]=Math.min(a,b);
    }
}