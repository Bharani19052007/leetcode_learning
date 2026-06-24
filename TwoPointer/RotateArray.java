/*
Problem: LeetCode 189 - Rotate Array

Category:
- Two Pointers

Approach:
1. Compute k modulo n to handle cases where k > n.
2. Reverse the entire array.
3. Reverse the first k elements.
4. Reverse the remaining n-k elements.
5. The array is rotated to the right by k positions.

Time Complexity: O(n)
- Three reversals, each taking O(n).

Space Complexity: O(1)
- In-place rotation with constant extra space.
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}