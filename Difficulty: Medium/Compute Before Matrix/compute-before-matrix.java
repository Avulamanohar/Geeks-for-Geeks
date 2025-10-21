// User function Template for Java

class Solution {
    public int[][] computeBeforeMatrix(int N, int M, int[][] after) {
        // Code here
        for(int i=N-1;i>=0;i--)
        {
            for(int j=M-1;j>0;j--)
            {
                after[i][j]-=after[i][j-1];
            }
        }
         for(int j=M-1;j>=0;j--)
        {
            for(int i=N-1;i>0;i--)
            {
                after[i][j]-=after[i-1][j];
            }
        }
        return after;
    }
}