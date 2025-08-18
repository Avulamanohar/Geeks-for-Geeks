class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);
        int h=0;
        int n=citations.length;
        int i=0;
        int f=citations[n-1];
        int j=f;
        while(i<=j)
        {
          int mid=i+(j-i)/2;
          for(int k=0;k<n;k++)
          {
              if(mid>citations[k])
              {
                  continue;
              }
              if(mid<=citations[k]&&mid<=n-k)
              {
                  i=mid+1;
              }
              else
              {
                  j=mid-1;
              }
              break;
          }
          
            
        }
        return j;
     
        
    }
}