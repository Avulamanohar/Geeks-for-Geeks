// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
       String b=Integer.toString(n);
       char c[]=b.toCharArray();
       int i=0;
       int j=c.length-1;
       while(i<=j)
        {
            char d=c[i];
            c[i]=c[j];
            c[j]=d;
            i++;
            j--;
        }
        String k=new String(c);
        int a=0;
        if(k.length()!=0)
        {
            a=Integer.parseInt(k);
        }
        return a;
    }
}