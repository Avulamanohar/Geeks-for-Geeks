// Complete this function!

class Geeks {
    public long count(int n)
    {
     int a[]=new int[3];
     a[0]=3;
     a[1]=5;
     a[2]=10;
     long dp[][]=new long[3][n+1];
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<=n;j++)
         {
             dp[i][j]=-1;
         }
     }
     return c(0,0,n,dp,a);
        
    }
    public long c(int ind,int sum,int n,long dp[][],int a[])
    {
         
        if(ind>2)
        {
            return 0;
        }
        if(sum==n)
        {
            return 1;
        }
        if(sum>n)
        {
            return 0;
        }
       
        if(dp[ind][sum]!=-1)
        {
            return dp[ind][sum];
            
        }
        return dp[ind][sum]=c(ind+1,sum,n,dp,a)+c(ind,sum+a[ind],n,dp,a);
    }
}