/*
Problem: LeetCode 643 - Maximum Average Subarray I

Category:
- Sliding Window

Approach:
1. Calculate the sum of the first window of size k.
2. Store it as the current maximum sum.
3. Slide the window by:
   - Adding the new element entering the window.
   - Removing the element leaving the window.
4. Update the maximum sum after each slide.
5. Return the maximum average by dividing the maximum sum by k.

Time Complexity: O(n)
- Each element is processed once.

Space Complexity: O(1)
- Only a few variables are used.
*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxsum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            maxsum = Math.max(maxsum, sum);
        }

        return (double) maxsum / k;
    }
}