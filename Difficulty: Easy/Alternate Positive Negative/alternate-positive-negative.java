class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)<0)
            {
                b.add(arr.get(i));
            }
            else
            {
                a.add(arr.get(i));
            }
        }
        int i=0;
        int j=0;
        arr.clear();
        while(i<a.size()&&j<b.size())
        {
            arr.add(a.get(i++));
            arr.add(b.get(j++));
        }
        while(i<a.size())
        {
            arr.add(a.get(i++));  
        }
        while(j<b.size())
        {
              arr.add(b.get(j++));
        }
        
    }
}