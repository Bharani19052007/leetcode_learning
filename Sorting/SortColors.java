/*
Problem: LeetCode 75 - Sort Colors

Category:
- Sorting

Approach:
1. Sort the array using Arrays.sort().
2. The array gets rearranged in ascending order.
3. Since the array contains only 0s, 1s, and 2s, the sorted array satisfies the required order.

Time Complexity: O(n log n)
- Arrays.sort() takes O(n log n) time.

Space Complexity: O(1)
- Primitive arrays are sorted in-place.
*/

class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}