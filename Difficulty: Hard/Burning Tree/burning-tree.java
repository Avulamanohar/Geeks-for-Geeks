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
}  */
class Solution {
    public static int minTime(Node root, int target) {
        Map<Node,Node> map=new HashMap<>();
        Set<Node> hs=new HashSet<>();
        parent(root,map);
        Node b[]=new Node[1];
        targ(root,target,b);
        Queue<Node> q=new LinkedList<>();
        q.add(b[0]);
        hs.add(b[0]);
        int count=0;
        while(!q.isEmpty())
        {
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                Node r=q.poll();
                if(r.left!=null&&!hs.contains(r.left))
                {
                    q.add(r.left);
                    hs.add(r.left);
                }
                if(r.right!=null&&!hs.contains(r.right))
                {
                    q.add(r.right);
                    hs.add(r.right);
                }
                if(map.get(r)!=null&&!hs.contains(map.get(r)))
                {
                    q.add(map.get(r));
                    hs.add(map.get(r));
                }
            }
            count++;
        }
        return count-1;
        
    }
    public static void parent(Node r,Map<Node,Node> map)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(r);
        while(!q.isEmpty())
        {
            Node root=q.poll();
            if(root.left!=null)
            {
                q.add(root.left);
                map.put(root.left,root);
            }
            if(root.right!=null)
            {
                q.add(root.right);
                map.put(root.right,root);
            }
        }
    }
    public static void targ(Node root,int target,Node b[])
    {
        if(root==null)
        {
            return;
        }
        if(root.data==target)
        {
            b[0]=root;
        } 
        targ(root.left,target,b);
        targ(root.right,target,b);
    }
}