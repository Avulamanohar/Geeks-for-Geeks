// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k)
    { 
      HashMap<Integer,Integer> arr1=new HashMap<>();
      int sum=0;
      int maxi=0;
      int n=arr.length;
      int i,j;
      for(i=0;i<n;i++)
      {
          sum+=arr[i];
        
           if(sum==k)
           {
               maxi=i+1;
               
           }
          int rem=sum-k;
          if(arr1.containsKey(rem))
          {
              int p=i-arr1.get(rem);
              maxi=Math.max(maxi,p);
          }
          
          if(!arr1.containsKey(sum))
          {
          arr1.put(sum,i);
          }
      }
      if(maxi==Integer.MIN_VALUE)
      {
          maxi=0;
      }
      
      return maxi;
      
        
    }
}
