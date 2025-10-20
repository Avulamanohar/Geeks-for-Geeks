class Solution {
    public ArrayList<Integer> specialSum(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> arr1=new ArrayList<>();
        int n=queries.length;
        for(int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<queries.length;i++)
        {
            int sum=0;;
            if(queries[i][0]!=0)
            {
                sum+=arr[queries[i][0]-1];
            }
            sum+=arr[arr.length-1]-arr[queries[i][1]];
            arr1.add(sum);
        }
        return arr1;
    }
}