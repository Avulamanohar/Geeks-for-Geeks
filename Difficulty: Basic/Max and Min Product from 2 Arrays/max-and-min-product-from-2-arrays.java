// User function Template for Java

class Solution {
    // Function to find the maximum element from array arr1 and
    // the minimum element from array arr2 and return their product.
    public long findMultiplication(int[] arr1, int[] arr2) {
        
        long a=Long.MIN_VALUE;
        long b=Long.MAX_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
            a=Math.max(a,arr1[i]);
            
        }
        for(int i=0;i<arr2.length;i++)
        {
            b=Math.min(b,arr2[i]);
        }
        return a*b;
        
    }
}