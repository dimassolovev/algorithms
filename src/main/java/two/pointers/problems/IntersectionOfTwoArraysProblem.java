package two.pointers.problems;

import java.util.Stack;

// https://leetcode.com/problems/intersection-of-two-arrays/description/
public class IntersectionOfTwoArraysProblem {
    private int[] countingSort(int[] array) {
        int[] counter = new int[1_000 + 1];
        int[] result = new int[array.length];

        for (int value : array)
            counter[value]++;

        int index = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                result[index++] = i;
                counter[i]--;
            }
        }

        return result;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Stack<Integer> result  = new Stack<>();
        int firstPointer = 0;
        int secondPointer = 0;
        nums1 = this.countingSort(nums1);
        nums2 = this.countingSort(nums2);

        while (firstPointer < nums1.length && secondPointer < nums2.length) {
            if (nums1[firstPointer] == nums2[secondPointer]) {
                if (result.isEmpty() || result.peek() != nums1[firstPointer])
                    result.push(nums1[firstPointer]);

                firstPointer++;
                secondPointer++;
            }
            else if (nums1[firstPointer] > nums2[secondPointer]) {
                secondPointer++;
            }
            else
                firstPointer++;
        }

        int[] intersection = new int[result.size()];
        for (int i = result.size() - 1; i >= 0; i--)
            intersection[i] = result.pop();

        return intersection;
    }
}