package two.pointers.problems;

import java.util.*;

// https://leetcode.com/problems/4sum/description/
public class FourSumProblem {
    // optimized brute force. The problem can be generalized.
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // instead of checking for duplicates you can use set
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])  // skip duplicates
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])  // skip duplicates
                    continue;

                int start = j + 1;
                int end = nums.length - 1;

                while (start < end) {
                    // overflow(int -> long)
                    if ((long) nums[i] + nums[j] + nums[start] + nums[end] == (long) target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;

                        // skip duplicates
                        while (start < end && nums[start] == nums[start - 1]) start++;
                        while (start < end && nums[end] == nums[end + 1]) end--;
                    }

                    else if (nums[i] + nums[j] + nums[start] + nums[end] > target)
                        end--;

                    else
                        start++;
                }
            }
        }

        return result;
    }
}
