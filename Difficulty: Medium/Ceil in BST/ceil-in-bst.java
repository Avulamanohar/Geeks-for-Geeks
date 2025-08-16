/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    int findCeil(Node root, int key)
    {
       List<Integer> arr=new ArrayList<Integer>();
       pre(root,arr);
       Collections.sort(arr);
       return ceil(arr,key);
        
    }
    void pre(Node root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.data);
        pre(root.left,arr);
        pre(root.right,arr);
    }
    int ceil(List<Integer> arr,int a)
    {
        int i,j;
    
        j=arr.size()-1;
        i=0;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr.get(mid)<a)
            {
                i=mid+1;
                
            }
            else
            {
                j=mid-1;
            }
        }
        if(i==arr.size())
        {
            return -1;
        }
        return arr.get(i);
    }
    
}