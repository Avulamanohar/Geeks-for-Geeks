class Solution {
    public static int largest(int[] arr) 
    { int i,j;
        int n=arr.length;
        int a=arr[0];
        for(i=0;i<n;i++)
        {
            a=Math.max(a,arr[i]);
        }
        return a;

        
    }
}
