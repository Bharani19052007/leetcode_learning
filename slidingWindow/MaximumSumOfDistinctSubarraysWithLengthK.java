/*
Problem: LeetCode 2461 - Maximum Sum of Distinct Subarrays With Length K

Category:
- Arrays
- Sliding Window
- Hash Map

Approach:
1. Use a fixed-size sliding window of size k.
2. Maintain a running sum of elements inside the window.
3. Use a HashMap to store the frequency of each element in the current window.
4. If the map size equals k, all elements are distinct.
5. Update the maximum sum whenever a valid window is found.
6. Slide the window by adding the new element and removing the old element.

Time Complexity: O(n)
- Each element enters and leaves the window once.

Space Complexity: O(k)
- HashMap stores at most k distinct elements.
*/

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long maxsum = 0, sum = 0;
        int n = nums.length;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        if (map.size() == k) {
            maxsum = sum;
        }

        // Slide the window
        for (int i = k; i < n; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            sum -= nums[i - k];
            map.put(nums[i - k], map.get(nums[i - k]) - 1);

            if (map.get(nums[i - k]) == 0) {
                map.remove(nums[i - k]);
            }

            if (map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}