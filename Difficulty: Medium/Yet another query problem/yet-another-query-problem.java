class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(map.containsKey(A[i]))
            {
                map.put(A[i],map.get(A[i])+1);
            }
            else
            {
                map.put(A[i],1);
            }
        }
        Map<Integer,Integer> map1=new HashMap<>(map);
        int a[]=new int[N];
        for(int i=N-1;i>=0;i--)
        {
            a[i]=map.get(A[i])-map1.get(A[i])+1;
            map1.put(A[i],map1.get(A[i])-1);
            
        }
        for(int i=0;i<num;i++)
        {  int count=0;
            for(int j=Q[i][0];j<=Q[i][1];j++)
            {
                if(a[j]==Q[i][2])
                {
                    count++;
                }
            }
            arr.add(count);
        }
        return arr;
    }
}
