/**
 * LeetCode 34 - Find First and Last Position of Element in Sorted Array
 *
 * Approach:
 * - Traverse the array once.
 * - When the target is found for the first time, store its index in 'start'.
 * - Keep updating 'end' whenever the target is encountered.
 * - After the traversal:
 *      - start = first occurrence of target
 *      - end = last occurrence of target
 * - If target is not found, both remain -1.
 *
 * Time Complexity: O(n)
 * - Single pass through the array.
 *
 * Space Complexity: O(1)
 * - Only a few extra variables are used.
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        return new int[]{start, end};
    }
}