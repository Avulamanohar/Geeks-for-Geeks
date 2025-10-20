class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            arr[i]+=arr[i-1];
            arr1.add(arr[i]);
        }
        
      
        return arr1;
    }
}