// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
import java.util.*;
class Tree {
    ArrayList<Integer> postOrder(Node node)
    {
        Stack<Node> st=new Stack<Node>();
        ArrayList<Integer> arr=new ArrayList<>();
        if(node==null)
        {
            return arr;
        }
        st.add(node);
        while(!st.isEmpty())
        {
            Node temp =st.pop();
            arr.add(temp.data);
            if(temp.left!=null)
            {
            st.add(temp.left);
            }
            if(temp.right!=null)
            {
            st.add(temp.right);
            }
            
            
        }
        Collections.reverse(arr);
        return arr;
    }
}