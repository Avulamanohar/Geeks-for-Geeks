// User function Template for Java

class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long k=0;
        boolean b=true;
        if(date%2==0)
        {
            b=false;
        }
        for(int i=0;i<car.length;i++)
        {
            if(b)
            {
                if(car[i]%2==0)
                {
                    k+=fine[i];
                }
            }
            else
            {
                if(car[i]%2==1)
                {
                    k+=fine[i];
                }
            }
        }
        return k;
        
    }

}