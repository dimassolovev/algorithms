package search;

public class BinarySearch {
    /*
    Problems:
        * First Bad Version:                        https://leetcode.com/problems/first-bad-version/description/
        * Valid Perfect Square:                     https://leetcode.com/problems/valid-perfect-square/description/
        * Search Insert Position:                   https://leetcode.com/problems/search-insert-position/description/
        * Sqrt(x):                                  https://leetcode.com/problems/sqrtx/description/
        * Search in Rotated Sorted Array:           https://leetcode.com/problems/search-in-rotated-sorted-array/description/
        * Peak Index in a Mountain Array:           https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
        * Find First and Last Position of Element:  https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
        * Search a 2D Matrix:                       https://leetcode.com/problems/search-a-2d-matrix/description/
        * Search a 2D Matrix II:                    https://leetcode.com/problems/search-a-2d-matrix-ii/description/
     */
    public int search(int[] sortedNumberArray, int target) {
        int left = 0;
        int right = sortedNumberArray.length - 1;

        while (left <= right) {
            final int middle = left + (right - left) / 2;

            if (sortedNumberArray[middle] == target)
                return middle;

            else if (sortedNumberArray[middle] < target)
                left = middle + 1;

            else if (sortedNumberArray[middle] > target)
                right = middle - 1;
        }

        return -1;
    }
}