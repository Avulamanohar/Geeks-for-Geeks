class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int a=Integer.MIN_VALUE;
        int b=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            a=Math.max(a,arr[i]);
            b=Math.min(b,arr[i]);
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(b);
        arr1.add(a);
        return arr1;
    }
}
