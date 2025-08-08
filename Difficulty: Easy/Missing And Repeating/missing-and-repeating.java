class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) 
    {
        int i,j;
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.length;
        int a=n;
        ArrayList<Integer> zaddu=new ArrayList<Integer>();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(i=1;i<=a;i++)
        {
            arr1.add(i);
        }
        for(i=0;i<n;i++)
        {  int b=arr[i];
            if(!hm.containsKey(b))
            {
                hm.put(b,1);
            }
            else
            {
                  hm.put(b,hm.get(b)+1); 
            }
        }
        int m=arr1.size();
        for(i=0;i<m;i++)
        {
            int c=arr1.get(i);
            {
                if(hm.containsKey(c)&&hm.get(c)==2)
                {
                    zaddu.add(c);
                }
            }
        }
        for(i=0;i<m;i++)
        {
            int c=arr1.get(i);
            {
                if(!hm.containsKey(c))
                {
                    zaddu.add(c);
                }
            }
        }
        return zaddu;
        
        
        
    }
}
