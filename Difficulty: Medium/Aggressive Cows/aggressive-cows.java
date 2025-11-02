class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
     Arrays.sort(stalls);
     int n=stalls.length;
     int a=1;
     int b=stalls[n-1]-stalls[0];
     while(a<=b)
     {
         int mid=a+(b-a)/2;
         if(agr(stalls,k,mid))
         {
             
             a=mid+1;
         }
         else
         {
             b=mid-1;
         }
     }
     return b;
    }
    public  boolean agr(int a[],int k,int t)
    {
        int ar=a[0];
        k--;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]-ar>=t)
            {
                ar=a[i];
                k--;
            }
            
            
        }
        if(k<=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}