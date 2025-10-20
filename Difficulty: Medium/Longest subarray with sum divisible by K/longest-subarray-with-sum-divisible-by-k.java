// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,-1);
            int l=0;
            long sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
                                int rem=(int)((sum%k)+k)%k;
                if(map.containsKey(rem))
                {
                    int f=i-map.get(rem);
                    l=Math.max(f,l);
                }

                else
                {
                      
                      map.put(rem,i);
                }
                
              
            }
            return l;
    }
}
