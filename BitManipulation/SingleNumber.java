/*
Problem: LeetCode 136 - Single Number

Category:
- Bit Manipulation

Approach:
1. Initialize the result with the first element.
2. Traverse the remaining elements.
3. Perform XOR between the current result and each element.
4. Duplicate numbers cancel each other out, leaving the unique number.
5. Return the final result.

Time Complexity: O(n)
- Traverse the array once.

Space Complexity: O(1)
- Only one variable is used.
*/

class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }

        return res;
    }
}