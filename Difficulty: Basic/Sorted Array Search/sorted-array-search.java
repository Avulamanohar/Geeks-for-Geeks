class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int i,j;
        int n=arr.length;
        
        for(i=0;i<n;i++)
        {
        if(arr[i]==k)
        {
            return true;
        }
        }
        return false;
    }
}