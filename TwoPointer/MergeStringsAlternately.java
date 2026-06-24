/**
 * LeetCode 1768 - Merge Strings Alternately
 *
 * Approach:
 * - Use two pointers (i, j) to traverse both strings.
 * - Append characters alternately from word1 and word2 using StringBuilder.
 * - After one string is exhausted, append the remaining characters
 *   from the other string.
 * - Convert the StringBuilder to a String and return it.
 *
 * Time Complexity: O(n + m)
 * - Each character from both strings is processed exactly once.
 *
 * Space Complexity: O(n + m)
 * - StringBuilder stores the merged string of length (n + m).
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();

        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            res.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            res.append(word2.charAt(j++));
        }

        return res.toString();
    }
}