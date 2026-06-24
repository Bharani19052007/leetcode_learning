/*
Problem: LeetCode 27 - Remove Element

Category:
- Arrays
- Two Pointers

Approach:
1. Use two pointers i and j.
2. Traverse the array using i.
3. If nums[i] is not equal to val, place it at index j.
4. Increment j to maintain the position for the next valid element.
5. After traversal, j represents the new length of the array.

Time Complexity: O(n)
- Each element is visited once.

Space Complexity: O(1)
- In-place modification with constant extra space.
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}