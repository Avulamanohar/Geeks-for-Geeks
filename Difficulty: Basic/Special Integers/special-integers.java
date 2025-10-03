
class Solution {
    public static int specialIntegers(int n, int[] arr) {
       Set<Integer> hs=new TreeSet<>();
        for(int i:arr)
        {
            hs.add(i);
        }
        int count=0;
        List<Integer> ar=new ArrayList<>(hs);
        for(int i=1;i<ar.size()-1;i++)
        {
            int a=ar.get(i);
            if(ar.get(i-1)==a-1&&ar.get(i+1)==a+1)
            {
                count++;
            }
        }
        return count;
    }
}
        
