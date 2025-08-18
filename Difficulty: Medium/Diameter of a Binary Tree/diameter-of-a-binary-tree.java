/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int diameter(Node root)
    {
     int a[]=new int[1];
     a[0]=0;
     daimeter(root,a);
     return a[0]-1;
        
    }
    int daimeter(Node root,int a[])
    {
         if(root==null)
         {
             return 0;
         }
         int l=daimeter(root.left,a);
         int r=daimeter(root.right,a);
         int sum=1+l+r;
         a[0]=Math.max(a[0],sum);
         return 1+Math.max(l,r);
    }
}