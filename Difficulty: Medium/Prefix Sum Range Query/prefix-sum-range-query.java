class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {   int sum=0;
            for(int j=queries[i][0];j<=queries[i][1];j++)
            {
                sum+=arr[j];
            }
            arr1.add(sum);
        }
        return arr1;
    }
}