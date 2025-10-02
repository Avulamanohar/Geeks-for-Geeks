class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<ArrayList<String>> arr1=new ArrayList<>();
        pal(0,s,arr,arr1);
        return arr1;
        
    }
    public void pal(int ind,String s,ArrayList<String> arr,ArrayList<ArrayList<String>> arr1)

    {
        if(ind>=s.length())
        {
            arr1.add(new ArrayList<>(arr));
            return;
        }
        for(int i=ind+1;i<=s.length();i++)
        {
          String h=s.substring(ind,i);  
          if(pali(h))
          {
              arr.add(h);
              pal(i,s,arr,arr1);
              arr.remove(arr.size()-1);
              
          }
        }
    }
    public boolean pali(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
            return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
