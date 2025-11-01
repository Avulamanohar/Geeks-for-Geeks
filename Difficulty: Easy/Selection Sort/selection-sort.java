class Solution {
    void selectionSort(int[] arr) {
        // code here
        
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int a=arr[i];
            int ind=i;
            for(int j=i;j<n;j++)
            {
                if(a>arr[j])
                {
                    a=arr[j];
                    ind=j;
                }
                
            }
            int temp=arr[i];
            arr[i]=a;
            arr[ind]=temp;
        }
    }
}