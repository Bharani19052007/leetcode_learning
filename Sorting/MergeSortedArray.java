/*
Problem: LeetCode 88 - Merge Sorted Array

Category:
- Sorting

Approach:
1. Copy all elements from nums2 into the empty positions of nums1.
2. Sort nums1 using Arrays.sort().
3. The sorted nums1 contains all elements from both arrays.

Time Complexity: O((m + n) log(m + n))
- Sorting dominates the running time.

Space Complexity: O(1)
- Ignoring the space used internally by Arrays.sort().
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}