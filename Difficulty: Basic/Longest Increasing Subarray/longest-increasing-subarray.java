// User function Template for Java
class Solution {
    public int lenOfLongIncSubArr(List<Integer> arr) {
     int c=1;
     int b=1;
     for(int i=1;i<arr.size();i++)
     {
         if(arr.get(i-1)<arr.get(i))
         {
             c++;
              b=Math.max(b,c);
         }
         else
         {
            
             c=1;
         }
     }
  
     return b;
    }
}