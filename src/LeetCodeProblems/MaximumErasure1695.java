package LeetCodeProblems;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasure1695 {
    public static int maximumUniqueSubarray(int[] nums) {
        int max = -1;
        int n = nums.length;
        int prev = 0;
        // boolean vis[] = new int[n];
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (set.contains(nums[i])) {
                max = Math.max(max, sum);
                while (prev < i && nums[prev] != nums[i]) {
                    set.remove(nums[prev]);
                    sum -= nums[prev];
                    prev++;
                }
                prev++;
//                sum += nums[i];
            } else {
                sum += nums[i];
                set.add(nums[i]);
            }
            i++;


    }

        max = Math.max(max, sum);
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {5,2,1,2,5,2,1,2,5};
        System.out.println( MaximumErasure1695.maximumUniqueSubarray(arr));
    }
}
