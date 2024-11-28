package two.pointers.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/description/
public class ThreeSumProblem {
    // We want nums[i] + nums[j] + nums[k] = 0.
    // it can be nums[j] + nums[k] = -nums[i], where -nums[i] is target, j and k - two pointers.
    // 3Sum -> 2Sum, where target is -nums[i]
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = nums.length - 1;
            int target = -nums[i];

            while (j < k) {
                int sum = nums[j] + nums[k];

                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicates
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    // Skip duplicates
                    while (j < k && nums[k] == nums[k - 1])
                        k--;

                    j++;
                    k--;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }
}
