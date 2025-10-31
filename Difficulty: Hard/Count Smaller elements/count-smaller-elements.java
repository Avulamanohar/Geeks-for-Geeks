// User function Template for Java

class Solution {
    int[] constructLowerArray(int[] arr) {
      
      int n=arr.length;
      int ans[]=new int[n];
      ans[n-1]=0;
      ArrayList<Integer> list=new ArrayList<>();
      list.add(arr[n-1]);
      for(int i=n-2;i>=0;i--)
      {
          
          int ind=cons(list,arr[i]);
          ans[i]=ind;
          list.add(ind,arr[i]);
          
      }
      return ans;
      
        
    }
    int cons(List<Integer> arr,int k)
    {
        int i=0;
        int j=arr.size()-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr.get(mid)<k)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return i;
    }
}