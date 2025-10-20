class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int l=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
            
        }
        l=sum;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i]-arr[i-k];
            l=Math.max(l,sum);

        }
        return l;
    }
}