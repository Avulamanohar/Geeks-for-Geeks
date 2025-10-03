class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            ar.add(Math.max(arr[i],arr[i-1]));
        }
        return ar;
    }
};