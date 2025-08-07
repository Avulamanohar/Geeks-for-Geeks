class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> hs1=new HashSet<>();
         HashSet<Integer> hs2=new HashSet<>();
         for(int i:a)
         {
             hs1.add(i);
         }
         for(int i:b)
         {
             hs2.add(i);
         }
         HashSet<Integer> hs3=new HashSet<>(hs1);
         
         for(int i:hs2)
         {
             hs3.add(i);
         }
         ArrayList<Integer> arr=new ArrayList<>(hs3);
         Collections.sort(arr);
         return arr;
        
        
    }
}
