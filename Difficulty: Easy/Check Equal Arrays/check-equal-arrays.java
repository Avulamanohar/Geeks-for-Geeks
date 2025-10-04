class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Map<Integer,Integer> map1=new HashMap<>();
                Map<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int ar=a[i];
            int br=b[i];
            if(map1.containsKey(ar))
            {
                map1.put(ar,map1.get(ar)+1);
            }
            else
            {
                map1.put(ar,1);
            }
             if(map2.containsKey(br))
            {
                map2.put(br,map2.get(br)+1);
            }
            else
            {
                map2.put(br,1);
            }
        }
        List<Integer> arr1=new ArrayList<>(map1.keySet());
         List<Integer> arr2=new ArrayList<>(map2.keySet());
         if(arr1.size()!=arr2.size())
         {
             return false;
         }
         for(int i=0;i<arr1.size();i++)
         {
             if(map2.containsKey(arr1.get(i)))
             {
                 if(map1.get(arr1.get(i))!=map2.get(arr1.get(i)))
                 {
                     return false;
                 }
             }
             else
             {
                return false;
             }
         }
         return true;
    }
}