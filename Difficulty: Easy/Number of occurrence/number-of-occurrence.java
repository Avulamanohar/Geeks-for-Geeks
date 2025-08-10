class Solution {
    int countFreq(int[] arr, int target) {
        int i,j;
        int n=arr.length;
        i=0;
        j=n-1;
        int ans=-1;
        int ans1=-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]<=target)
            {
                ans=mid;
                i=mid+1;
                
            }
            else
            {
                j=mid-1;
            }
        }
        i=0;
        j=n-1;
         while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]<target)
            {
                
                i=mid+1;
                
            }
            else
            {
                ans1=mid;
                j=mid-1;
            }
        }
        if(ans==-1||ans1==-1)
        
        {
            return 0;
        }if(ans!=-1&&ans1!=-1)
        {
        if(arr[ans]!=arr[ans1])
        {
            return 0;
        }}
        return ans-ans1+1;
        
    }
}
