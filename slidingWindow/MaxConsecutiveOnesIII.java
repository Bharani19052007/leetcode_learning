/*
Problem: LeetCode 1004 - Max Consecutive Ones III

Category:
- Sliding Window

Approach:
1. Use two pointers to maintain a sliding window.
2. Expand the window by moving the right pointer.
3. Count the number of zeros in the current window.
4. If the number of zeros exceeds k, shrink the window from the left until it becomes valid.
5. Update the maximum window size during each valid window.
6. Return the maximum length found.

Time Complexity: O(n)
- Each element enters and leaves the window at most once.

Space Complexity: O(1)
- Only constant extra space is used.
*/

class Solution {
    public int longestOnes(int[] a, int k) {
        int l = 0, r = 0, max = 0, zero = 0;

        while (r < a.length && l < a.length) {
            if (a[r] == 0) {
                zero++;
            }

            while (zero > k) {
                if (a[l] == 0) {
                    zero--;
                }
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}