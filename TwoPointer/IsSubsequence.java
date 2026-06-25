/*
Problem: LeetCode 392 - Is Subsequence

Category:
- Two Pointers

Approach:
1. Initialize two pointers:
   - i for string s.
   - j for string t.
2. Traverse both strings.
3. If characters match, move pointer i.
4. Always move pointer j.
5. If i reaches the end of s, then s is a subsequence of t.

Time Complexity: O(n)
- n = length of t

Space Complexity: O(1)
- Constant extra space is used.
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}