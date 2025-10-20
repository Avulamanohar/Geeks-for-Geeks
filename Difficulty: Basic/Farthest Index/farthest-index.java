// User function Template for Java

class Solution {
    public int findIndex(int[] arr, int x) {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==x)
            {
                return i+1;
            }
        }
        return -1;
    }
}
