
class Solution {
    public static int findClosest(int[] arr, int k) {
        
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]<=k)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        if(i==arr.length)
        {
            return arr[j];
        }
        if(j==-1)
        {
            return arr[i];
        }
        int f;
        if(Math.abs(k-arr[i])>Math.abs(k-arr[j]))
        {
            f=arr[j];
        }
        else
        {
            f=arr[i];
        }
        return f;
        
        
    }
}
