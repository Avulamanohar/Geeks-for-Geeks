class Solution {
    // Function to partition the array around the range such
    // that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b) {
        // code here
        List<Integer> ak=new ArrayList<>();
         List<Integer> bk=new ArrayList<>();
          List<Integer> ck=new ArrayList<>();
          for(int i=0;i<arr.length;i++)
          {
              if(arr[i]<a)
              {
                  ak.add(arr[i]);
              }
              else if(arr[i]>b)
              {
                  ck.add(arr[i]);
              }
              else
              {
                  bk.add(arr[i]);
              }
          }
          int i=0;
          int j=0;
          while(j<ak.size())
          {
              arr[i++]=ak.get(j++);
          }
          j=0;
          while(j<bk.size())
          {
              arr[i++]=bk.get(j++);
          }
          j=0;
          while(j<ck.size())
          {
              arr[i++]=ck.get(j++);
          }
        
    }
}