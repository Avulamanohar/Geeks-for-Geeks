// User function Template for Java

class Solution {

    public ArrayList<Integer> findMean(int arr[], int q[]) {

        int m=q.length;
     ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
           arr[i]+=arr[i-1]; 
        }
        for(int i=0;i<q.length;i=i+2)
        {
            int k=q[i]-1;
            if(q[i]==0)
            {
                arr1.add(arr[q[i+1]]/(q[i+1]-q[i]+1));
            }
            else
            {
            arr1.add((arr[q[i+1]]-arr[k])/(q[i+1]-q[i]+1));
            }
        }
        return arr1;
    }
}
