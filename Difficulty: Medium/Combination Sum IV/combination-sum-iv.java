// User function Template for Java

class Solution {
    int combinationSum4(int[] arr, int key) 
    {
        int dp[]=new int[key+1];
       
            for(int j=0;j<key+1;j++)
            {
                dp[j]=-1;
            
        }
        return com(0,arr,key,dp);
        
    }
    int com(int sum,int arr[],int key,int dp[])
    {
        if(sum==key)
        {
            return 1;
        }
        if(sum>key)
        {
          
            return 0;
        }
           if(dp[sum]!=-1)
        {
            return dp[sum];
        }
     
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            
       int kl=com(sum+arr[i],arr,key,dp);
        
        k+=kl;
        
        }
        dp[sum]=k;
        
        return k;
    }
}