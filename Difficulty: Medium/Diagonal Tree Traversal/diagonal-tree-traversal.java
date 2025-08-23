/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree {
    public ArrayList<Integer> diagonal(Node root)
    {
        Map<Integer,List<Integer>> map=new TreeMap<>();
        dia(root,map,0,0);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(List<Integer> p:map.values())
        {
            for(int i:p)
            {
                arr.add(i);
            }
        }
        return arr;
    }
    public void dia(Node root,Map<Integer,List<Integer>> map,int c,int r)
    {
        if(root==null)
        {
            return;
        }
        int sum=Math.abs(c-r);
        if(!map.containsKey(sum))
        {
                  map.put(sum,new ArrayList<>());
        }
        

            map.get(sum).add(root.data);
            dia(root.left,map,c-1,r+1);
            dia(root.right,map,c+1,r+1);
        
    }
}