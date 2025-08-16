// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        // Code here
        List<Integer> arr=new ArrayList<>();
        pre(root,arr);
        Collections.sort(arr);
        return floor(arr,x);
    }
    public static void pre(Node root,List<Integer> arr)
    {
        if(root==null)
        {return;
        }
        arr.add(root.data);
        pre(root.left,arr);
        pre(root.right,arr);
    }
    public static int floor(List<Integer> arr,int a)
    {
        int n=arr.size();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr.get(mid)<=a)
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
        return arr.get(j);
    }
}