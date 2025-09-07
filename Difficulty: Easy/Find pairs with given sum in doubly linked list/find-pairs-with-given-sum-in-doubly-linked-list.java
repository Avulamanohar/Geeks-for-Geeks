import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        // Step 1: Copy linked list data into array
        while (head != null) {
            arr.add(head.data);
            head = head.next;
        }

        // Step 2: Sort the array
        Collections.sort(arr);

        // Step 3: Two-pointer approach
        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            int sum = arr.get(i) + arr.get(j);

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr.get(i));
                pair.add(arr.get(j));
                result.add(pair);

                i++;
                j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
