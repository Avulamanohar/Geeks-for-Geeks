class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        int t=arr[n-1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t-arr[i])
            {
                return true;
            }
        }
        return false;
        
    }
}