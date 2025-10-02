class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        // code here
        
         Arrays.sort(arr);
        ArrayList<Integer> arr1=new ArrayList<>();
              LinkedHashSet<ArrayList<Integer>> arr2=new LinkedHashSet<>();
              boolean f[]=new boolean[arr.length];
              uni(arr,f,arr1,arr2);
        
        ArrayList<ArrayList<Integer>> arr3=new ArrayList<>(arr2);

        return arr3;
        
    }
    public static void uni(int arr[],boolean f[],ArrayList<Integer> arr1,LinkedHashSet<ArrayList<Integer>> arr2)
    {
        if(arr1.size()==arr.length)
        {
            arr2.add(new ArrayList<>(arr1));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!f[i])
            {
                f[i]=true;
                arr1.add(arr[i]);
                uni(arr,f,arr1,arr2);
                arr1.remove(arr1.size()-1);
                f[i]=false;
            }
        }
    }
};