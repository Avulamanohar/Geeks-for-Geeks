class Solution {
    public int getSecondLargest(int[] arr) 
    {
        int i,j;
        int n=arr.length;
        int a=arr[0];
        int b=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            a=Math.max(a,arr[i]);
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]<a)
            {
                b=Math.max(b,arr[i]);
            }
        }
        if(b==Integer.MIN_VALUE)
        {
            return -1;
        }
       return b;
        // code here
        
    }
}