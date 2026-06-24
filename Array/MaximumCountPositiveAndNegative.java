/*
Problem: LeetCode 2529 - Maximum Count of Positive Integer and Negative Integer

Category:
- Arrays
- Counting

Approach:
1. Traverse the array once.
2. Count the number of negative integers.
3. Count the number of positive integers.
4. Ignore zeros.
5. Return the maximum of the two counts.

Time Complexity: O(n)
- Traverse the array once.

Space Complexity: O(1)
- Only two variables are used.
*/

class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg++;
            } else if (nums[i] > 0) {
                pos++;
            }
        }

        return Math.max(pos, neg);
    }
}