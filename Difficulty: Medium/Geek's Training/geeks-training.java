class Solution {
    public int maximumPoints(int mat[][])
    {
        int n=mat.length;
     int dp[][]=new int[n][3];
     for(int i=0;i<n;i++)
     {
         dp[i][0]=-1;
          dp[i][1]=-1;
           dp[i][2]=-1;
     }
     int a=max(0,mat,n,0,dp);
     int b=max(0,mat,n,1,dp);
     int c=max(0,mat,n,2,dp);
     return Math.max(a,Math.max(b,c));
        
    }
    public int max(int i,int mat[][],int n,int k,int dp[][])
    {
       if(i==n)
       {
           return 0;
       }
       if(dp[i][k]!=-1)
       {
           return dp[i][k];
       }
       int r=0,f=0,l=0;
       if(k!=0)
       {
       r=mat[i][0]+max(i+1,mat,n,0,dp);
       }
       if(k!=1)
       {
          
        f=mat[i][1]+max(i+1,mat,n,1,dp);
       }
       if(k!=2)
       {
          l=mat[i][2]+max(i+1,mat,n,2,dp);
       }
         return dp[i][k]=Math.max(r,Math.max(f,l));
    }
}