/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    public int sumOfLongRootToLeafPath(Node root) 
    {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> arr1=new ArrayList<>();
        TreeSet<Integer> hs=new TreeSet<>();
        
        int count[]=new int[1];
        sum(root,arr,arr1,count);
       
        for(List<Integer> arr2:arr1)
        {
             int k=0;
        if(count[0]==arr2.size())
        {
        for(int i:arr2)
        {
            k+=i;
        }
        hs.add(k);
        }
        }
        int a=hs.last();
        return a;
        
    }
    public void sum(Node root,List<Integer> arr,List<List<Integer>> arr1,int a[])
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.data);
        if(root.left==null&&root.right==null)
        {
            a[0]=Math.max(a[0],arr.size());
            arr1.add(new ArrayList<Integer>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        sum(root.left,arr,arr1,a);
                sum(root.right,arr,arr1,a);
        arr.remove(arr.size()-1);
    }
}