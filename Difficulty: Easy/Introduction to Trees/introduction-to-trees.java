// User function Template for Java

class Solution {
    static int countNodes(int i) 
    {
        
        int n=1;
        int j,k;
        for(j=1;j<i;j++)
        {
            n*=2;
        }
        return n;
        
    }
}