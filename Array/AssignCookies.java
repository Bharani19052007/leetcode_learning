/*
Problem: LeetCode 455 - Assign Cookies

Category:
- Greedy

Approach:
1. Sort both the greed factor array and cookie size array.
2. Use two pointers to traverse the arrays.
3. If the current cookie can satisfy the current child, assign it and move to the next child.
4. Always assign the smallest possible cookie to maximize the number of satisfied children.
5. Return the number of satisfied children.

Time Complexity: O(n log n + m log m)
- Sorting dominates the running time.

Space Complexity: O(1)
- Ignoring the space used by the sorting algorithm.
*/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0, count = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
}