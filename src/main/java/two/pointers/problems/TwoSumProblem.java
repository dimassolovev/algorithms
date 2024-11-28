package two.pointers.problems;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/two-sum/description/
public class TwoSumProblem {
    public int[] twoSum(int[] nums, int target) {
        int[][] newNums = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            newNums[i][0] = nums[i];
            newNums[i][1] = i;
        }
        Arrays.sort(newNums, Comparator.comparingInt(integers -> integers[0]));

        int[] result = new int[2];
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (newNums[start][0] + newNums[end][0] == target) {
                result[0] = newNums[start][1];
                result[1] = newNums[end][1];
                break;
            }

            else if (newNums[start][0] + newNums[end][0] > target)
                end--;

            else
                start++;
        }

        return result;
    }
}
