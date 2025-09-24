// User function Template for Java

class Solution {
    public int MinSquares(int n) {
        // Code here
        int d=(int)Math.sqrt(n)+1;
        int a[][]=new int[d][n+1];
        int b[]=new int[d];
        for(int i=0;i<d;i++)
        {
            b[i]=(i+1)*(i+1);
        }
        
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<n+1;j++)
            {
            a[i][j]=-1;
            }
        }
        return Min(0,n,a);
    }
    public int Min(int ind,int sum,int arr[][])
    {
        if(sum<0)
        {
            return Integer.MAX_VALUE; 
        }
        if(sum==0)
        {
            return 0;
        }
        if(ind==arr.length)
        {
            
            
           return Integer.MAX_VALUE; 
        }
        if(arr[ind][sum]!=-1)
        {
            return arr[ind][sum];
        }
        int a=Integer.MAX_VALUE;
        int br=Min(ind+1,sum,arr);
        int c=Min(ind,sum-(ind+1)*(ind+1),arr);
        if(c!=a)
        {
            a=1+c;
        }
        return  arr[ind][sum]=Math.min(a,br);
        
    }
}