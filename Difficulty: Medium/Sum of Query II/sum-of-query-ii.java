// User function Template for Java

class Solution {
    List<Integer> querySum(int n, int arr[], int q, int queries[]) {
        // code here
        List<Integer> arr1=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
           arr[i]+=arr[i-1]; 
        }
        for(int i=0;i<2*q;i++)
        {
            queries[i]--;
        }
        for(int i=0;i<2*q;i=i+2)
        {
            int b=arr[queries[i+1]];
            if(queries[i]!=0)
            {b-=arr[queries[i]-1];
            }
            arr1.add(b);
            
        }
        return arr1;
    }
}