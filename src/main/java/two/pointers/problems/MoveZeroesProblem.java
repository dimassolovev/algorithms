package two.pointers.problems;

// https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroesProblem {
    public void moveZeroes(int[] nums) {
        int notZeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[notZeroCount++] = nums[i];
        }

        for (int i = notZeroCount; i < nums.length; i++)
            nums[i] = 0;

    }
}
