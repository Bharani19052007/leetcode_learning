/*
Problem: LeetCode 977 - Squares of a Sorted Array

Category:
- Sorting

Approach:
1. Traverse the array and replace each element with its square.
2. Sort the squared values using Arrays.sort().
3. Return the sorted array.

Time Complexity: O(n log n)
- Squaring takes O(n).
- Sorting takes O(n log n).

Space Complexity: O(1)
- Ignoring the space used internally by Arrays.sort().
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}