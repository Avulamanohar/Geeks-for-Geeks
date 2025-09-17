// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        if(n==1)
        { int a[]=new int[1];
            return a;
        }
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<n;i++)
        {
            dp[i]=-1;
        }
        fib(n-1,dp);
        return dp;
        
    }
    public static int fib(int ind,int a[])
    {
        if(a[ind]!=-1)
        {
            return a[ind];
        }
        a[ind]= fib(ind-1,a)+fib(ind-2,a);
        return a[ind];
        
        
    }
}