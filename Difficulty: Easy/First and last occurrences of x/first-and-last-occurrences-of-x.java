// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        // Code here
        ArrayList<Integer> a=new ArrayList<>();
        if(first(x,arr)!=-1)
        {
        
        a.add(first(x,arr));
        a.add(last(x,arr));
        }
        else
        {
            a.add(-1);
        }
        return a;
        
    }
    public int first(int x,int arr[])
    {
        int i=0;int j=arr.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]<x)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==x)
        {
        return i;
        }
        return -1;
    }
     public int last(int x,int arr[])
    {
        int i=0;int j=arr.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]<=x)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        if(j==-1)
        {
            return -1;
        }
        if(arr[j]==x)
        {
        return j;
    }
        return -1;
    }
}
