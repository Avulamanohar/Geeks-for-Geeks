// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        // Complete the function
        int b[]=new int[2];
        b[0]=-1;
        b[1]=-1;
        int count =1;
        int n=arr.length;
        int a=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
           if(a==arr[i])
           {
               b[0]=i+1;
               b[1]=a;
               break;
           }
           else
           {
               a=arr[i];
           }
        }
        return b;
    }
    
}
