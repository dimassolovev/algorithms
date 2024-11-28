package two.pointers.problems;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArrayProblem {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstPointer = m - 1;
        int secondPointer = n - 1;
        int mergePointer = m + n - 1;

        while (firstPointer >= 0 && secondPointer >= 0) {
            if (nums1[firstPointer] <= nums2[secondPointer]) {
                nums1[mergePointer] = nums2[secondPointer];
                secondPointer--;
            }
            else {
                nums1[mergePointer] = nums1[firstPointer];
                firstPointer--;
            }
            mergePointer--;
        }

        while (secondPointer >= 0) {
            nums1[mergePointer] = nums2[secondPointer];
            secondPointer--;
            mergePointer--;
        }
    }
}
