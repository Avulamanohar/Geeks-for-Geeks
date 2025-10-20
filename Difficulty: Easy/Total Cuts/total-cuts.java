class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int n=A.length;
        int a[]=new int[n];
        a[n-1]=A[n-1];
        for(int j=n-2;j>=0;j--)
        {
         
            a[j]=Math.min(A[j],a[j+1]);
        }
        
        for(int i=1;i<n;i++)
        {
           A[i]=Math.max(A[i],A[i-1]); 
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(a[i+1]+A[i]>=K)
            {
                count++;
            }
            
        }
        return count;
        
    }
}
