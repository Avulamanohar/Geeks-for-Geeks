// User function Template for Java

class Solution {
    int equalSum(int[] arr) {
        // Write your code here
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<n;i++)
        {
            int f=0;
            
            if(i==0)
            {
                f=0;
            }
            else
            {
                f=arr[i-1];
            }
            if(f==arr[n-1]-arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}