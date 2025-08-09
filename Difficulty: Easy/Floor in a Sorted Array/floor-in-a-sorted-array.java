class Solution {
    public int findFloor(int[] arr, int x) 
    {
        int i,j;
        int n=arr.length;
        i=0;
        j=n-1;
        int ans=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(arr[mid]>x)
            {
                j=mid-1;
                ans=j;
                
            }
            else
        {
        i=mid+1;
        }
        }
       return j;
    }
}
