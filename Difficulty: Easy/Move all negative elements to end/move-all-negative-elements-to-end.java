// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr2.add(arr[i]);
            }
            else
            {
                arr1.add(arr[i]);
            }
        }
        int j=0;
        for(int i=0;i<arr1.size();i++)
        {
            arr[j++]=arr1.get(i);
        }
        for(int i=0;i<arr2.size();i++)
        {
            arr[j++]=arr2.get(i);
        }
    }
}