// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        long p=1;
         int b=0;
        for(int i=0;i<arr.length;i++)
        {  
            if(arr[i]==0)
            {
                b++;
            }
            if(arr[i]!=0)
               p*=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {   
            if(b==1)
            {
                if(arr[i]!=0)
                {
                    arr[i]=0;
                }
                else
                {
                    arr[i]=(int)p;
                }
                
            }
            else if(b>1)
            {
                arr[i]=0;
            }
            
            else
            {
                
            

            
            arr[i]=(int)(p/arr[i]);
            }
           
           
        }
        return arr;
    }
}
