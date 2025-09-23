// User function Template for Java
class Solution {
    static int sumOfDigits(int N) {
        
        if(N<10)
        {
            return (N*(N+1))/2;
        }
        int dp[]=new int[N+1];
        for(int i=0;i<N+1;i++)
        {
            dp[i]=-1;
        }
        
        for(int i=0;i<10;i++)
        {
         dp[i]=i;   
        }
        int sum=0;
        
        for(int i=10;i<=N;i++)
        {
            String a=Integer.toString(i);
            int k=(int)Math.pow(10,a.length()-1);
            dp[i]=1+dp[i-k];
        }
        for(int i=0;i<=N;i++)
        {
            sum+=dp[i];
        }
        return sum;
    }
  
}