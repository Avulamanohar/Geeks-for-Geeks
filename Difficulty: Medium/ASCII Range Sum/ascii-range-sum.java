class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        char c[]=s.toCharArray();
        int a[]=new int[s.length()];
        a[0]=(int)c[0];
        for(int i=1;i<s.length();i++)
        {
           a[i]=a[i-1]+(int)c[i]; 
        }
        Map<Character,Integer> hs=new HashMap<>();
        Map<Character,Integer> hs1=new HashMap<>();
        for(int i=0;i<c.length;i++)
        {
            if(!hs.containsKey(c[i]))
            {
                hs.put(c[i],i);
            }
            hs1.put(c[i],i);
        }
        ArrayList<Character> arr=new ArrayList<>(hs.keySet());
               ArrayList<Integer> arr1=new ArrayList<>();
               for(int i=0;i<arr.size();i++)
               {
                   if(hs.get(arr.get(i))<hs1.get(arr.get(i)))
                   {
                       int b=a[hs1.get(arr.get(i))-1]-a[hs.get(arr.get(i))];
                       if(b!=0)
                          arr1.add(b);
                   }
               }
               return arr1;
        
    }
}