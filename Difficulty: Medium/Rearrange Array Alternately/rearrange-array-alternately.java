class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int a[]=new int[arr.length];
        int f=0;
        int j=arr.length-1;
        int k=0;
        while(f<=j)
        {
            a[k++]=arr[j--];
            if(k<arr.length)
             a[k++]=arr[f++];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=a[i];
        }
    }
}
