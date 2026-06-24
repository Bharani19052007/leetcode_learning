/*
Problem: LeetCode 821 - Shortest Distance to a Character

Category:
- Two Pointers

Approach:
1. Traverse the string from left to right and keep track of the most recent occurrence of c.
2. Store the distance from each index to the nearest c on the left.
3. Traverse from right to left and keep track of the nearest occurrence of c on the right.
4. Update each position with the minimum distance from either side.
5. Return the resulting array.

Time Complexity: O(n)
- Two linear traversals.

Space Complexity: O(n)
- Array to store distances.
*/

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length(), pos = -n, res[] = new int[n];

        // Left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                pos = i;
            res[i] = i - pos;
        }

        // Right to left
        for (int i = pos - 1; i >= 0; i--) {
            if (s.charAt(i) == c)
                pos = i;
            res[i] = Math.min(res[i], pos - i);
        }

        return res;
    }
}