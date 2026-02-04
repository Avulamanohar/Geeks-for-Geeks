class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        int dp[][]=new int[nums.length][target+1];
        for(int ar[]:dp)
        {
            Arrays.fill(ar,-1);
        }
        return perfect(0,target,nums,dp);
        
        
        
    }
    public int perfect (int i,int sum,int a[],int dp[][])
    {
        
        if(sum<0)
            {
                
            
            return 0;
            }
        if(i==a.length)
        {
            
            if(sum==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        }
        if(dp[i][sum]!=-1)
        {
            return dp[i][sum];
        }
        return dp[i][sum]=perfect(i+1,sum-a[i],a,dp)+perfect(i+1,sum,a,dp);
    }
}