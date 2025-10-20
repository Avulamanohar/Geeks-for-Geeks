// User function Template for Java

class Solution {
    // Prints average of a stream of numbers
    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        // code here
        long sum=0;
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            sum+=(long)arr.get(i);
            arr1.add((int)(sum/(i+1)));
        }
        return arr1;
    }
}