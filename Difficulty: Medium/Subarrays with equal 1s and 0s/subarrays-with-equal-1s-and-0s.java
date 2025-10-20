class Solution {
    public int countSubarray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=-1;
            }
        }
        Map<Integer,Integer> map=new HashMap<>();
        int c=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];

            if(map.containsKey(sum))
            {
                c+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else
            {
                map.put(sum,1);
            }
        }
        return c;
        
    }
}