class Solution {
    int floorSqrt(int n) {
        // code here
        int num=n/2;
       
        if(n<=2)
        {
           return 1; 
        }
        int i=1;
        int j=num;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            int s=mid*mid;
            if(s<=n)
            {
               i=mid+1; 
            }
            else
            {
                j=mid-1;
            }
        }
        return j;
    }
}