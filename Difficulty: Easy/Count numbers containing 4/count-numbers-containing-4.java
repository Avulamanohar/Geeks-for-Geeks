
class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count=0;
        for(int i=1;i<=n;i++)
        {
            String b=Integer.toString(i);
            if(b.contains("4"))
            {
                count++;
            }
        }
        return count;
    }
}
