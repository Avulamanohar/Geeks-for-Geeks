
class Solution {
    int countPartitions(int[] arr, int d) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int k=(sum-d)/2;
        if(sum-d<0||(sum-d)%2!=0)
        {
            return 0;
        }
        int n=arr.length;
      int dp[][]=new int[arr.length][k+1];
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<=k;j++)
          {
              dp[i][j]=-1;
          }
      }
      return part(0,0,arr,dp,k);
        
    }
    int part(int ind,int sum,int arr[],int dp[][],int k)
    {
        
        if(ind==arr.length)
        {
            if(sum==k)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(dp[ind][sum]!=-1)
        {
            return dp[ind][sum];
        }
        int a=part(ind+1,sum,arr,dp,k);
        int c=0;;
        if(k-sum>=arr[ind])
        {
           c=part(ind+1,sum+arr[ind],arr,dp,k); 
        }
        
            dp[ind][sum]=a+c;

        
        return dp[ind][sum];
    }
}
