class Solution {
    public int search(int arr[], int x) {
        // code here
        int k=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                k=i;
                break;
            }
        }
        return k;
    }
}
