class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(arr1.get(arr1.size()-1)!=arr[i])
            {
                arr1.add(arr[i]);
            }
            
        }
        return arr1;
        
    }
}
