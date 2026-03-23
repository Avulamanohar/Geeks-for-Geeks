class Solution {
    public void binSort(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                c++;
            }
        }
        int b=arr.length-c;
        for(int i=0;i<b;i++)
        {
            arr[i]=0;
            
        }
        for(int i=b;i<arr.length;i++)
        {
            arr[i]=1;
        }
    }
}
