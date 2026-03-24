// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        // code here
        int k=arr[arr.length-1];
        arr[arr.length-1]=-1;
        
        for(int i=arr.length-2;i>=0;i--)
        {
            int b=arr[i];
            arr[i]=k;
            k=Math.max(b,k);
        }
        ArrayList<Integer> arrr=new ArrayList<>();
        for(int i:arr)
        {
            arrr.add(i);
        }
        return arrr;
    }
}