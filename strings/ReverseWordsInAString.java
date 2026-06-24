/*
Problem: LeetCode 151 - Reverse Words in a String

Category:
- Strings

Approach:
1. Remove leading and trailing spaces using trim().
2. Split the string into words using one or more spaces as delimiter.
3. Traverse the words array from right to left.
4. Append each word to a StringBuilder.
5. Remove the extra trailing space and return the result.

Time Complexity: O(n)
- Each character is processed a constant number of times.

Space Complexity: O(n)
- Extra space is used for the array of words and StringBuilder.
*/

class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        StringBuilder s2 = new StringBuilder();

        String[] a = s1.split("\\s+");

        for (int i = a.length - 1; i >= 0; i--) {
            s2.append(a[i] + " ");
        }

        return s2.toString().trim();
    }
}