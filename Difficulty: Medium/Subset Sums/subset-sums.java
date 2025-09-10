// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) 
    { ArrayList<Integer> a=new ArrayList<>();
        sub(0,arr,0,a);
        return a;
        
    }
    public void sub(int ind,int arr[],int sum,ArrayList<Integer> a)
    {
        if(ind==arr.length){
            a.add(sum);
            return;
        }
        sum+=arr[ind];
        sub(ind+1,arr,sum,a);
        sum-=arr[ind];
        sub(ind+1,arr,sum,a);
    }
}