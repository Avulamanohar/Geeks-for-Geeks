class Solution {
    int majorityElement(int arr[]) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int k=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
            map.put(arr[i],1);
            }
            else
            {
            map.put(arr[i],map.get(arr[i])+1);
            }
            if(map.get(arr[i])>arr.length/2)
            {
                k=arr[i];
            }
        }
        return k;
    }
}