/*
Problem: LeetCode 2108 - Find First Palindromic String in the Array

Category:
- Two Pointers

Approach:
1. Traverse each word in the array.
2. For each word, use two pointers:
   - left starts at the beginning.
   - right starts at the end.
3. Compare characters while moving both pointers toward the center.
4. If all characters match, the word is a palindrome.
5. Return the first palindrome found.
6. If none exists, return an empty string.

Time Complexity: O(n × m)
- n = number of words
- m = average length of a word

Space Complexity: O(1)
- Constant extra space is used.
*/

class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPal(w)) {
                return w;
            }
        }
        return "";
    }

    boolean isPal(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}