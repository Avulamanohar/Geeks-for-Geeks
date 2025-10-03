class Solution {
    public ArrayList<String> possibleWords(int[] arr) {
       String a[]=new String[10];
       a[2]="abc";
       a[3]="def";
       a[4]="ghi";
       a[5]="jkl";
       a[6]="mno";
       a[7]="pqrs";
       a[8]="tuv";
       a[9]="wxyz";
       ArrayList<String> as=new ArrayList<>();
       poss(0,a,arr,as,"");
       return as;
        
    }
    public void poss(int ind,String a[],int arr[],ArrayList<String> as,String s)
    {
        
        if(ind==arr.length)
        {
           as.add(s);
           return;
        }
        if(arr[ind]<=1)
        {
            poss(ind+1,a,arr,as,s);
        }
        else
        {
        String k=a[arr[ind]];
        for(int i=0;i<k.length();i++)
        {
            String g=s+k.charAt(i)+"";
            poss(ind+1,a,arr,as,g);
            
        }}
    }
}