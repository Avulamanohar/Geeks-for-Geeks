// User function Template for Java

class Solution {
    static int maxSum(int N, int mat[][]) {
        int dp[]=new int[N+1];
        for(int i=0;i<=N;i++)
        {dp[i]=-1;
        }
      return max(0,N,mat,dp);  
        
    }
    static int max(int ind,int N,int mat[][],int dp[])
    {    
        if(N<=ind)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        
        

       int  a=mat[0][ind]+max(ind+2,N,mat,dp);
       int b=mat[1][ind]+max(ind+2,N,mat,dp);
       int c=max(ind+1,N,mat,dp);
       return dp[ind]=Math.max(a,Math.max(b,c));
        
    }
}