// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int dp[]=new int[height.length];
        dp[0]=0;
        if(height.length==1)
        {
            return 0;
        }
        dp[1]=Math.abs(height[1]-height[0]);
        if(height.length==2)
        {
            return dp[1];
        }
        int n=height.length;
        for(int i=2;i<n;i++)
        {
            int a=Math.abs(height[i]-height[i-1])+dp[i-1];
            int b=Math.abs(height[i]-height[i-2])+dp[i-2];
            dp[i]=Math.min(a,b);
        }
        return dp[height.length-1];
    }
}