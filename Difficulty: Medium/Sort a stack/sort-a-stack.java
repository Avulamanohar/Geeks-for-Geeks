class Solution {
    public void sortStack(Stack<Integer> st) {
        
        if(st.isEmpty())
        {
            return;
        }
        int temp=st.pop();
        sortStack(st);
        insert(temp,st);
        
    }
    public void insert(int t,Stack<Integer> st)
    {
        if(st.isEmpty()||st.peek()<=t)
        {
            st.push(t);
            return;
        }
        int temp=st.pop();
        insert(t,st);
        st.push(temp);
    }
}