class Solution {
    static ArrayList<Integer> leaders(int arr[]) 
    {
        int i,j;
        ArrayList<Integer> arr1=new ArrayList<>();
        int n=arr.length;
        for(i=0;i<n-1;i++)
        {    boolean b=true;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    b=false;
                    break;
                }
                
            }
            if(b==true)
                {
                    arr1.add(arr[i]);
                }
        }
      arr1.add(arr[n-1]);  
   return arr1;
    }
}
