class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())
        {
            return;
        }
        int temp=st.pop();
        reverseStack(st);
        rev(temp,st);
    }
    public static void rev(int el,Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            st.add(el);
            return;
        }
        int temp=st.pop();
        rev(el,st);
        st.push(temp);
    }
}
