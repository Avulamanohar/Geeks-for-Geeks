// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) 
    {
      int i=0;
      int j=arr.length-1;
      while(i<=j)
      {
          int mid=i+(j-i)/2;
          if(arr[mid]==1)
          {
              j=mid-1;
              
          }
          else
          {
              i=mid+1;
          }
          
      }
      if(i==arr.length)
      {
          return -1;
      }
      return i;
    }
}