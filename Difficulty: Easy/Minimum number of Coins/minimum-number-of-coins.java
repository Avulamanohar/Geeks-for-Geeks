class Solution {
    public int findMin(int n) {
    int a[]=new int[4];
    a[0]=10;
    a[1]=5;
    a[2]=2;
    a[3]=1;
    int sum=0;
    int k=0;
    while(n!=0)
    {
        if(k==4)
        {
            break;
        }
       if(n>=a[k])
       {
           n=n-a[k];
           sum++;
       }
       else
       {
           k++;
       }
        
    }
    int dp[][]=new int[4][n+1];
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<n+1;j++)
        {
            dp[i][j]=-1;
        }
    }
    
        return sum;
        //find(0,n,a,dp);
    }
    public int find(int ind,int n,int arr[],int dp[][])
    {
       
        if(n==0)
        {
            return 0;
        }
      
      if(ind==arr.length)
      {
          return Integer.MAX_VALUE;
      }
      if(dp[ind][n]!=-1)
      {
          return dp[ind][n];
      }
      int a=find(ind+1,n,arr,dp);
      int b=Integer.MAX_VALUE;
      if(n-arr[ind]>=0)
      {
         int c=find(ind,n-arr[ind],arr,dp); 
         if(c!=Integer.MAX_VALUE)
         {
             b=1+c;
         }
      }
      return dp[ind][n]=Math.min(a,b);
    }
}
