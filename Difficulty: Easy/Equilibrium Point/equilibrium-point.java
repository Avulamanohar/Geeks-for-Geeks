class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int k=-1;
        int n=arr.length;
        int a[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            a[i]=sum;
        }
        for(int i=1;i<n;i++)
        {
            if(a[i-1]==a[n-1]-a[i])
            {
                k=i;
                break;
            }
        }
         return k;
    }
}
