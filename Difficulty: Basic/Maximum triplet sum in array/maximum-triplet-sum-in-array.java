// User function Template for Java

class Solution {
    // Function to find the maximum triplet sum in the array.
    public int maxTripletSum(List<Integer> arr) {
        int a=Integer.MIN_VALUE;
        int b=Integer.MIN_VALUE;
        int c=Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<arr.size();i++)
        {
           if(arr.get(i)>a)
           {
               a=arr.get(i);
               k=i;
           }
        }
        arr.remove(k);
        k=0;
         for(int i=0;i<arr.size();i++)
        {
           if(arr.get(i)>b)
           {
               b=arr.get(i);
               k=i;
           }
        }
        arr.remove(k);
        k=0;
                 for(int i=0;i<arr.size();i++)
        {
           if(arr.get(i)>c)
           {
               c=arr.get(i);
               k=i;
           }
        }
        return a+b+c;
        
        
    }
}
