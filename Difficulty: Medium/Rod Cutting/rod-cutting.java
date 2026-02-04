class Solution {
    public int cutRod(int[] price) {
        int l=price.length;
        int dp[][]=new int[l+1][l+1];
        for(int r[]:dp)
        {
            Arrays.fill(r,-1);
        }
        return cut(0,l,price,dp);
        
    }
    public int cut(int i,int l,int p[],int dp[][])
    {
        if(l<0)
        {
            return 0;
        }
        if(i==p.length)
        {
            return 0;
        }
        if(dp[i][l]!=-1)
        {
            return dp[i][l];
        }
        int Ntake=cut(i+1,l,p,dp);
        int take=0;
        if(l-(i+1)>=0)
        {
            take=p[i]+cut(i,l-(i+1),p,dp);
            
        }
        return dp[i][l]=Math.max(Ntake,take);
    }
}