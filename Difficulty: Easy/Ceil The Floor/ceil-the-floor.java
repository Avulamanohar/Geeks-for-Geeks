// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int i ,j;
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        for(int k:arr)
        {
            hs.add(k);
        }
        int b[]=new int[2];
        b[0]=-1;
        b[1]=-1;
        ArrayList<Integer> arr1=new ArrayList<>(hs);
        Collections.sort(arr1);
        i=0;
        j=arr1.size()-1;
        int ans1=-1;
        int m=arr1.size();
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(arr1.get(mid)<=x)
            {
                   ans1=arr1.get(mid);
                      i=mid+1;
              }
            else
            {  

                j=mid-1;
               }
            
            
        }
         i=0;
        j=arr1.size()-1;
        int ans2=-1;
         while(i<=j)
        {
            int mid=(i+j)/2;
            if(arr1.get(mid)<x)
            {
                      i=mid+1;
              }
            else
            {  
                ans2=arr1.get(mid);
                j=mid-1;
               }
            
            
        }
        b[0]=ans1;
        b[1]=ans2;
        
      return b;
        
    }
}
