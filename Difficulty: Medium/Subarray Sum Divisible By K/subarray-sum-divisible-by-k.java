// User function Template for Java

class Solution {
    // Function to count the number of subarrays with a sum that is divisible by K
    public int subCount(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        long sum=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            int rem=(int)((sum%k)+k)%k;
            if(map.containsKey(rem))
            {
                c+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else
            {
                map.put(rem,1);
            }
        }
        return c;
    }
}
