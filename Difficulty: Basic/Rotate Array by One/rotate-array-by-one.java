// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int k=arr[arr.length-1];
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int b=temp;
            temp=arr[i];
            arr[i]=b;
           
        }
        arr[0]=k;

    }
}