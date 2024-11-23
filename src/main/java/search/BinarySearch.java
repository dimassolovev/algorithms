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
        var left = 0;
        var right = sortedNumberArray.length - 1;

        while (left <= right) {
            final var mid = Math.floorDiv(left + right, 2);

            if (sortedNumberArray[mid] == target)
                return mid;

            else if (sortedNumberArray[mid] < target)
                left = mid + 1;

            else if (sortedNumberArray[mid] > target)
                right = mid - 1;
        }

        return -1;
    }
}