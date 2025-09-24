// User function Template for Java

class Solution {
    public long NoOfChicks(int N) {
        // Code here
        if(N<=6)
        {
            return (long)Math.pow(3,N-1);
        }
        long a[]=new long[N+1];
        a[0]=0;
        for(int i=1;i<=6;i++ )
        {
            a[i]=(long)Math.pow(3,i-1);
        }
        long sum=0;
        for(int i=6;i>0;i--)
        {
            a[i]=a[i]-a[i-1];
            sum+=a[i];
        }
        for(int i=7;i<=N;i++)
        { 
            sum=sum-a[i-6];
            a[i]=sum*2;
            sum+=a[i];
        }
        return sum;
    }
}