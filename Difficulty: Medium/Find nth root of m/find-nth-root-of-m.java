class Solution {
    public int nthRoot(int n, int m)
    {
        int i,j;
        int f=m/n;
        if(m==1)
        {
            return 1;
        }
        
        i=1;
        j=f;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            int product=1;
            for(i=0;i<n;i++)
            {
                product*=mid;
            }
            if(product<=m)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
            
        }
        int pro=1;
        for(int k=0;k<n;k++)
        {
            pro*=j;
        }
        if(pro==m)
        {
            return j ;
        }
        return -1;
    }
}