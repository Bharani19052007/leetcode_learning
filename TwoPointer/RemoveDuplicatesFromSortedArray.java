/*
Problem: LeetCode 26 - Remove Duplicates from Sorted Array

Category:
- Two Pointers

Approach:
1. Handle the empty array case.
2. Initialize a slow pointer k to 1.
3. Use a fast pointer i to traverse the array from index 1.
4. If nums[i] is different from the previous element, place it at index k and increment k.
5. Return k, which represents the number of unique elements.

Time Complexity: O(n)
- Each element is visited once.

Space Complexity: O(1)
- In-place modification with constant extra space.
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}