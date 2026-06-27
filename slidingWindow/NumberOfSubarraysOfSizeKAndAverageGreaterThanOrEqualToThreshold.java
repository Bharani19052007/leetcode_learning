/*
Problem: LeetCode 1343 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Category:
- Sliding Window

Approach:
1. Calculate the sum of the first window of size k.
2. Check if its average is greater than or equal to the threshold.
3. Slide the window one element at a time:
   - Add the new element entering the window.
   - Remove the element leaving the window.
4. After each slide, check if the average meets the threshold.
5. Count all valid subarrays and return the count.

Time Complexity: O(n)
- Each element is processed once.

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0, count = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int avg = sum / k;
        if (avg >= threshold) {
            count++;
        }

        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            avg = sum / k;
            if (avg >= threshold) {
                count++;
            }
        }

        return count;
    }
}