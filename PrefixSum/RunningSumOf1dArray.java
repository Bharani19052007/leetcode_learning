/*
Approach:
1. Traverse the array starting from index 1.
2. For each element, add the previous element's running sum to the current element.
3. Update the current element in-place to store the running sum.
4. Return the modified array containing the running sums.

Time Complexity: O(n)
- We traverse the array once.

Space Complexity: O(1)
- The running sums are computed in-place without using extra space.
*/

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}