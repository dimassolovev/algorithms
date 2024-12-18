package two.pointers.problems;

import java.util.Arrays;

// https://leetcode.com/problems/sort-colors/description/
public class SortColorsProblem {
    // Dutch National Flag
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (mid <= high) {
            if (nums[mid] == 0)
                swap(nums, mid++, low++);
            else if (nums[mid] == 1)
                mid++;
            else
                swap(nums, mid, high--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
