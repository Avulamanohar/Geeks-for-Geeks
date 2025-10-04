class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int i=0;
        int j=arr.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]<k)
            {
                i=mid+1;
            }
            else 
            {
                j=mid-1;
            }
           
        }
        if(i>arr.length-1)
        {
            return -1;
        }
        if(arr[i]==k)
        {
            return i;
        }
        return -1;
    }
}