class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        Boolean a[][]=new Boolean[arr.length][sum+1];
       
       
        
        return isSub(0,sum,arr,a);
    }
    static Boolean isSub(int ind,int sum,int arr[],Boolean a[][])
    {
        
         if(sum==0)
            {

                return true;
            }
            if(ind==arr.length)
            {
                return sum==0;
            }
        if(a[ind][sum]!=null)
        {
    
                return a[ind][sum];
        
        }
        
         Boolean notake= isSub(ind+1,sum,arr,a);
         Boolean take=false;
        if(sum>=arr[ind])
        {
          take= isSub(ind+1,sum-arr[ind],arr,a);
        
        }
        Boolean k=take||notake;
        a[ind][sum]=k;
     
        return k;
    }
}