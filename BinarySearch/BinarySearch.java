/*
Problem: LeetCode 704 - Binary Search

Category:
- Binary Search

Approach:
1. Initialize two pointers:
   - left at the beginning of the array.
   - right at the end of the array.
2. Find the middle element.
3. If the middle element is the target, return its index.
4. If the target is greater, search the right half.
5. Otherwise, search the left half.
6. Repeat until the target is found or the search space becomes empty.

Time Complexity: O(log n)
- The search space is halved in each iteration.

Space Complexity: O(1)
- Constant extra space is used.
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}