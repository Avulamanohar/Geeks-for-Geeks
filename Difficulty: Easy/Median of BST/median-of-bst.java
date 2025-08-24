class Tree {
    public static float findMedian(Node root)
    {
        List<Integer> arr=new ArrayList<>();
        find(root,arr);
        int n=arr.size();
        if(n%2==0)
        {
            return ((float)(arr.get(n/2-1))+(float)(arr.get(n/2)))/2;
        }
        return (float)(arr.get(n/2));
    }
    public static void find(Node root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        find(root.left,arr);
        arr.add(root.data);
        find(root.right,arr);
    }
}