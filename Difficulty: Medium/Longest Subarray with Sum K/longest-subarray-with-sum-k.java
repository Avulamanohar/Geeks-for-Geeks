// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,-1);
            int l=0;
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
                if(map.containsKey(sum-k))
                {
                    int f=i-map.get(sum-k);
                    l=Math.max(f,l);
                }
                if(!map.containsKey(sum))
                      map.put(sum,i);
            }
            return l;
        
    }
}
