/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Solution {
    public static int treePathsSum(Node root)
    {
        List<Integer> arr=new ArrayList<>();
        int a[]=new int[1];
        back(root,arr,a);
        return a[0];
        
        // add code here.
    }
    public static void back(Node root,List<Integer> arr,int a[])
    {
        if(root==null)
        {
            return;
        }
        arr.add(root.data);
        if(root.left==null&&root.right==null)
        {  
            int b=St(arr);
            a[0]+=b;
            arr.remove(arr.size()-1);
            return;
        }
        back(root.left,arr,a);
        back(root.right,arr,a);
        arr.remove(arr.size()-1);
    }
    public static int St(List<Integer> arr)
    {
        int  s=0;
        for(int i=0;i<arr.size();i++)
        {
            s=s*10+arr.get(i);
        }
     
        return s;
    }
}