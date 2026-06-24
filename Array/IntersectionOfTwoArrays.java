/*
Problem: LeetCode 349 - Intersection of Two Arrays

Category:
- Hashing

Approach:
1. Store all elements of nums1 in a HashSet.
2. Traverse nums2 and check if each element exists in the set.
3. If found, add it to another HashSet to avoid duplicates.
4. Convert the result set into an array and return it.

Time Complexity: O(m + n)
- m = length of nums1
- n = length of nums2

Space Complexity: O(m + k)
- m for the first HashSet
- k for the result set
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            if (s1.contains(num)) {
                res.add(num);
            }
        }

        int[] a = new int[res.size()];
        int j = 0;

        for (int i : res) {
            a[j++] = i;
        }

        return a;
    }
}