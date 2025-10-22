class Solution {
    public int countSubarrays(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int count=0;
        int m=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                count++;
            }
            if(!map.containsKey(count))
            {
                map.put(count,i);
            }
            if(map.containsKey(count-k))
            {
                int a=map.get(count);
                int b=a-map.get(count-k+1);
                int c=a-map.get(count-k)-b;
                m+=c;
            }
            
        }
        return m;
        // code here
        
    }
}
 