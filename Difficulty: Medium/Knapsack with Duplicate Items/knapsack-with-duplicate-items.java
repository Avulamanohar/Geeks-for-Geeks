class Solution {
    public int knapSack(int val[], int wt[], int capacity) {

      int dp[][]=new int[val.length][capacity+1];
      for(int r[]:dp)
      {
          Arrays.fill(r,-1);
      }
      return knap(0,capacity,val,wt,dp);
        
    }
    public int knap(int i,int k,int val[],int wt[],int dp[][])
    {
        
        if(i==val.length)
        {
            
           return 0;
           
        }
        if(dp[i][k]!=-1)
        {
            return dp[i][k];
        }
        int notake=knap(i+1,k,val,wt,dp);
        int take=Integer.MIN_VALUE;
        if(k-wt[i]>=0)
        {int cake=knap(i,k-wt[i],val,wt,dp);
        if(cake!=-(int)1e9)
        {
            take=val[i]+cake;
        }
            
        }
        return dp[i][k]=Math.max(take,notake);
    }
}