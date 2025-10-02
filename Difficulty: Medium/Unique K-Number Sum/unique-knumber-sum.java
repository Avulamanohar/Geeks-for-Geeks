class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
        int dp[][]=new int[n+1][10];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<=9;j++)
            {
                dp[i][j]=-1;
            }
        }
        int a[]=new int[9];
        for(int i=0;i<9;i++)
        {a[i]=i+1;
        }
        ArrayList<Integer> arr=new ArrayList<>();  
        ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        comb(0,n,k,a,arr,arr1);
        return arr1;
    }
    public void comb(int ind,int sum,int k,int a[],ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> arr1)
    { 
        if(arr.size()>k)
        {return;
        }
        if(sum<0)
        {
            return;
        }
        if(sum==0)
        {
            if(arr.size()==k)
            {
                arr1.add(new ArrayList<>(arr));

            }
            return;
        }
        if(ind==a.length)
        {
            return;
        }
        comb(ind+1,sum,k,a,arr,arr1);
        arr.add(a[ind]);
        comb(ind+1,sum-a[ind],k,a,arr,arr1);
       // if(arr.size()!=0)
        arr.remove(arr.size()-1);
    }
}